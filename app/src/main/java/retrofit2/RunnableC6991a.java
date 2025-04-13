package retrofit2;

import java.io.IOException;
import retrofit2.DefaultCallAdapterFactory;

/* compiled from: R8$$SyntheticClass */
/* renamed from: retrofit2.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC6991a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f69588b;

    /* renamed from: c */
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.C69811 f69589c;

    /* renamed from: d */
    public final /* synthetic */ Callback f69590d;

    /* renamed from: e */
    public final /* synthetic */ Object f69591e;

    public /* synthetic */ RunnableC6991a(DefaultCallAdapterFactory.ExecutorCallbackCall.C69811 c69811, Callback callback, Object obj, int i2) {
        this.f69588b = i2;
        this.f69589c = c69811;
        this.f69590d = callback;
        this.f69591e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f69588b) {
            case 0:
                DefaultCallAdapterFactory.ExecutorCallbackCall.C69811 c69811 = this.f69589c;
                this.f69590d.mo35016a(c69811.f69423c, (Throwable) this.f69591e);
                break;
            default:
                DefaultCallAdapterFactory.ExecutorCallbackCall.C69811 c698112 = this.f69589c;
                Callback callback = this.f69590d;
                Response response = (Response) this.f69591e;
                if (!c698112.f69423c.f69421c.isCanceled()) {
                    callback.mo35017b(c698112.f69423c, response);
                    break;
                } else {
                    callback.mo35016a(c698112.f69423c, new IOException("Canceled"));
                    break;
                }
        }
    }
}
