public class Main {
    public static void main(String[] args) {
        HttpDirector director = new HttpDirector();

        // 1. Представление 1: cURL команда
        CurlCommandBuilder curlBuilder = new CurlCommandBuilder();
        director.makeCreateUserRequest(curlBuilder);
        System.out.println("=== Representation 1: cURL Command ===");
        System.out.println(curlBuilder.getResult());
        System.out.println();

        // 2. Представление 2: Объект Java
        HttpRequestObjectBuilder objectBuilder = new HttpRequestObjectBuilder();
        director.makeCreateUserRequest(objectBuilder);
        HttpRequest requestObject = objectBuilder.getResult();
        System.out.println("=== Representation 2: HttpRequest Object ===");
        System.out.println(requestObject);
        System.out.println();

        // 3. Валидация
        try {
            HttpRequestObjectBuilder invalidBuilder = new HttpRequestObjectBuilder();
            invalidBuilder.setMethod("GET").getResult();
        } catch (IllegalStateException e) {
            System.out.println("=== Validation Check ===");
            System.out.println("Exception caught successfully: " + e.getMessage());
        }
    }
}