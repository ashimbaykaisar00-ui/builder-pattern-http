public interface HttpRequestBuilder {
    HttpRequestBuilder setUrl(String url);
    HttpRequestBuilder setMethod(String method);
    HttpRequestBuilder setBody(String body);
    HttpRequestBuilder setContentType(String contentType);
}