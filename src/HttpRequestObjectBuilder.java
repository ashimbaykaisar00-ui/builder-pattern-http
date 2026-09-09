public class HttpRequestObjectBuilder implements HttpRequestBuilder {
    private String url;
    private String method;
    private String body;
    private String contentType;

    @Override
    public HttpRequestObjectBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public HttpRequestObjectBuilder setMethod(String method) {
        this.method = method;
        return this;
    }

    @Override
    public HttpRequestObjectBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public HttpRequestObjectBuilder setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public HttpRequest getResult() {
        if (url == null || url.trim().isEmpty()) {
            throw new IllegalStateException("Validation error: URL is required.");
        }
        if (method == null || method.trim().isEmpty()) {
            throw new IllegalStateException("Validation error: HTTP method is required.");
        }
        return new HttpRequest(url, method, body, contentType);
    }
}