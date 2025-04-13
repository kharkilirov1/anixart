package retrofit2;

import java.io.IOException;
import okhttp3.Request;

/* loaded from: classes3.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    /* renamed from: clone */
    Call<T> mo35198clone();

    Response<T> execute() throws IOException;

    boolean isCanceled();

    /* renamed from: o0 */
    void mo35010o0(Callback<T> callback);

    Request request();
}
