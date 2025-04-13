package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Request;
import retrofit2.CallAdapter;

/* loaded from: classes3.dex */
final class DefaultCallAdapterFactory extends CallAdapter.Factory {

    /* renamed from: a */
    @Nullable
    public final Executor f69417a;

    public static final class ExecutorCallbackCall<T> implements Call<T> {

        /* renamed from: b */
        public final Executor f69420b;

        /* renamed from: c */
        public final Call<T> f69421c;

        /* renamed from: retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1 */
        public class C69811 implements Callback<T> {

            /* renamed from: b */
            public final /* synthetic */ Callback f69422b;

            public C69811(Callback callback) {
                this.f69422b = callback;
            }

            @Override // retrofit2.Callback
            /* renamed from: a */
            public void mo35016a(Call<T> call, Throwable th) {
                ExecutorCallbackCall.this.f69420b.execute(new RunnableC6991a(this, this.f69422b, th, 0));
            }

            @Override // retrofit2.Callback
            /* renamed from: b */
            public void mo35017b(Call<T> call, Response<T> response) {
                ExecutorCallbackCall.this.f69420b.execute(new RunnableC6991a(this, this.f69422b, response, 1));
            }
        }

        public ExecutorCallbackCall(Executor executor, Call<T> call) {
            this.f69420b = executor;
            this.f69421c = call;
        }

        @Override // retrofit2.Call
        public void cancel() {
            this.f69421c.cancel();
        }

        @Override // retrofit2.Call
        public Response<T> execute() throws IOException {
            return this.f69421c.execute();
        }

        @Override // retrofit2.Call
        public boolean isCanceled() {
            return this.f69421c.isCanceled();
        }

        @Override // retrofit2.Call
        /* renamed from: o0 */
        public void mo35010o0(Callback<T> callback) {
            this.f69421c.mo35010o0(new C69811(callback));
        }

        @Override // retrofit2.Call
        public Request request() {
            return this.f69421c.request();
        }

        @Override // retrofit2.Call
        public Call<T> clone() {
            return new ExecutorCallbackCall(this.f69420b, this.f69421c.clone());
        }
    }

    public DefaultCallAdapterFactory(@Nullable Executor executor) {
        this.f69417a = executor;
    }

    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    /* renamed from: a */
    public CallAdapter<?, ?> mo35015a(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Utils.m35047f(type) != Call.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        }
        final Type m35046e = Utils.m35046e(0, (ParameterizedType) type);
        final Executor executor = Utils.m35050i(annotationArr, SkipCallbackExecutor.class) ? null : this.f69417a;
        return new CallAdapter<Object, Call<?>>(this) { // from class: retrofit2.DefaultCallAdapterFactory.1
            @Override // retrofit2.CallAdapter
            /* renamed from: a */
            public Type mo35011a() {
                return m35046e;
            }

            @Override // retrofit2.CallAdapter
            /* renamed from: b */
            public Call<?> mo35012b(Call<Object> call) {
                Executor executor2 = executor;
                return executor2 == null ? call : new ExecutorCallbackCall(executor2, call);
            }
        };
    }
}
