package subjects.reflections;

import subjects.exceptions.ValidationException;

public class ValidationRequest {

    public static void nullCheck(CreateUserRequest request) throws IllegalAccessException {

        var fields = request.getClass().getDeclaredFields();
        for (var field : fields) {
            if (field.getAnnotation(NotBlank.class) != null) {
                field.setAccessible(true);
                var value = (String) field.get(request);
                if (value == null || value.isBlank()) {
                    throw new ValidationException("Field " + field.getName() + "is blank.");
                }
            }
        }

    }
}
