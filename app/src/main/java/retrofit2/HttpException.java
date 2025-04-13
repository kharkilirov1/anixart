package retrofit2;

import java.util.Objects;

/* loaded from: classes3.dex */
public class HttpException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException(Response<?> response) {
        super("HTTP " + response.f69562a.code() + " " + response.f69562a.message());
        Objects.requireNonNull(response, "response == null");
        response.f69562a.code();
        response.f69562a.message();
    }
}
