public class CurlCommandBuilder implements HttpRequestBuilder {
    private String url;
    private String method = "GET";
    private String body;
    private String contentType;

    @Override
    public CurlCommandBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public CurlCommandBuilder setMethod(String method) {
        this.method = method;
        return this;
    }

    @Override
    public CurlCommandBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public CurlCommandBuilder setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public String getResult() {
        if (url == null || url.trim().isEmpty()) {
            throw new IllegalStateException("Validation error: Cannot format cURL command without a URL.");
        }

        StringBuilder curl = new StringBuilder("curl -X ").append(method);

        if (contentType != null && !contentType.trim().isEmpty()) {
            curl.append(" -H \"Content-Type: ").append(contentType).append("\"");
        }
        if (body != null && !body.trim().isEmpty()) {
            curl.append(" -d '").append(body).append("'");
        }

        curl.append(" \"").append(url).append("\"");
        return curl.toString();
    }
}