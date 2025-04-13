package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.CallAdapter;

@IgnoreJRERequirement
/* loaded from: classes3.dex */
final class CompletableFutureCallAdapterFactory extends CallAdapter.Factory {

    /* renamed from: a */
    public static final CallAdapter.Factory f69411a = new CompletableFutureCallAdapterFactory();

    @IgnoreJRERequirement
    public static final class BodyCallAdapter<R> implements CallAdapter<R, CompletableFuture<R>> {

        /* renamed from: a */
        public final Type f69412a;

        @IgnoreJRERequirement
        public class BodyCallback implements Callback<R> {

            /* renamed from: b */
            public final CompletableFuture<R> f69413b;

            public BodyCallback(BodyCallAdapter bodyCallAdapter, CompletableFuture<R> completableFuture) {
                this.f69413b = completableFuture;
            }

            @Override // retrofit2.Callback
            /* renamed from: a */
            public void mo35016a(Call<R> call, Throwable th) {
                this.f69413b.completeExceptionally(th);
            }

            @Override // retrofit2.Callback
            /* renamed from: b */
            public void mo35017b(Call<R> call, Response<R> response) {
                if (response.m35033a()) {
                    this.f69413b.complete(response.f69563b);
                } else {
                    this.f69413b.completeExceptionally(new HttpException(response));
                }
            }
        }

        public BodyCallAdapter(Type type) {
            this.f69412a = type;
        }

        @Override // retrofit2.CallAdapter
        /* renamed from: a */
        public Type mo35011a() {
            return this.f69412a;
        }

        @Override // retrofit2.CallAdapter
        /* renamed from: b */
        public Object mo35012b(Call call) {
            CallCancelCompletableFuture callCancelCompletableFuture = new CallCancelCompletableFuture(call);
            call.mo35010o0(new BodyCallback(this, callCancelCompletableFuture));
            return callCancelCompletableFuture;
        }
    }

    @IgnoreJRERequirement
    public static final class CallCancelCompletableFuture<T> extends CompletableFuture<T> {

        /* renamed from: b */
        public final Call<?> f69414b;

        public CallCancelCompletableFuture(Call<?> call) {
            this.f69414b = call;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (z) {
                this.f69414b.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    public static final class ResponseCallAdapter<R> implements CallAdapter<R, CompletableFuture<Response<R>>> {

        /* renamed from: a */
        public final Type f69415a;

        @IgnoreJRERequirement
        public class ResponseCallback implements Callback<R> {

            /* renamed from: b */
            public final CompletableFuture<Response<R>> f69416b;

            public ResponseCallback(ResponseCallAdapter responseCallAdapter, CompletableFuture<Response<R>> completableFuture) {
                this.f69416b = completableFuture;
            }

            @Override // retrofit2.Callback
            /* renamed from: a */
            public void mo35016a(Call<R> call, Throwable th) {
                this.f69416b.completeExceptionally(th);
            }

            @Override // retrofit2.Callback
            /* renamed from: b */
            public void mo35017b(Call<R> call, Response<R> response) {
                this.f69416b.complete(response);
            }
        }

        public ResponseCallAdapter(Type type) {
            this.f69415a = type;
        }

        @Override // retrofit2.CallAdapter
        /* renamed from: a */
        public Type mo35011a() {
            return this.f69415a;
        }

        @Override // retrofit2.CallAdapter
        /* renamed from: b */
        public Object mo35012b(Call call) {
            CallCancelCompletableFuture callCancelCompletableFuture = new CallCancelCompletableFuture(call);
            call.mo35010o0(new ResponseCallback(this, callCancelCompletableFuture));
            return callCancelCompletableFuture;
        }
    }

    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    /* renamed from: a */
    public CallAdapter<?, ?> mo35015a(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Utils.m35047f(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type m35046e = Utils.m35046e(0, (ParameterizedType) type);
        if (Utils.m35047f(m35046e) != Response.class) {
            return new BodyCallAdapter(m35046e);
        }
        if (m35046e instanceof ParameterizedType) {
            return new ResponseCallAdapter(Utils.m35046e(0, (ParameterizedType) m35046e));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
