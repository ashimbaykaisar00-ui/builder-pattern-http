public class HttpDirector {

    public void makeGetUsersRequest(HttpRequestBuilder builder) {
        builder.setUrl("https://api.example.com/v1/users")
                .setMethod("GET");
    }

    public void makeCreateUserRequest(HttpRequestBuilder builder) {
        builder.setUrl("https://api.example.com/v1/users")
                .setMethod("POST")
                .setContentType("application/json")
                .setBody("{\"name\": \"Kaisar\", \"role\": \"developer\"}");
    }
}