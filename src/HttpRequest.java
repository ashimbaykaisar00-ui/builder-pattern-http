public final class HttpRequest {
    private final String url;
    private final String method;
    private final String body;
    private final String contentType;

    HttpRequest(String url, String method, String body, String contentType) {
        this.url = url;
        this.method = method;
        this.body = body;
        this.contentType = contentType;
    }

    public String getUrl() { return url; }
    public String getMethod() { return method; }
    public String getBody() { return body; }
    public String getContentType() { return contentType; }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", contentType='" + contentType + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}