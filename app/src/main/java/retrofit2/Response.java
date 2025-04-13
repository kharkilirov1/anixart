package retrofit2;

import javax.annotation.Nullable;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public final class Response<T> {

    /* renamed from: a */
    public final okhttp3.Response f69562a;

    /* renamed from: b */
    @Nullable
    public final T f69563b;

    public Response(okhttp3.Response response, @Nullable T t, @Nullable ResponseBody responseBody) {
        this.f69562a = response;
        this.f69563b = t;
    }

    /* renamed from: b */
    public static <T> Response<T> m35032b(@Nullable T t, okhttp3.Response response) {
        if (response.isSuccessful()) {
            return new Response<>(response, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public boolean m35033a() {
        return this.f69562a.isSuccessful();
    }

    public String toString() {
        return this.f69562a.toString();
    }
}
