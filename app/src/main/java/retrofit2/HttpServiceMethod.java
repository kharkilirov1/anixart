package retrofit2;

import java.lang.reflect.Method;
import javax.annotation.Nullable;
import kotlin.KotlinNullPointerException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
abstract class HttpServiceMethod<ResponseT, ReturnT> extends ServiceMethod<ReturnT> {

    /* renamed from: a */
    public final RequestFactory f69424a;

    /* renamed from: b */
    public final Call.Factory f69425b;

    /* renamed from: c */
    public final Converter<ResponseBody, ResponseT> f69426c;

    public static final class CallAdapted<ResponseT, ReturnT> extends HttpServiceMethod<ResponseT, ReturnT> {

        /* renamed from: d */
        public final CallAdapter<ResponseT, ReturnT> f69427d;

        public CallAdapted(RequestFactory requestFactory, Call.Factory factory, Converter<ResponseBody, ResponseT> converter, CallAdapter<ResponseT, ReturnT> callAdapter) {
            super(requestFactory, factory, converter);
            this.f69427d = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        /* renamed from: c */
        public ReturnT mo35019c(Call<ResponseT> call, Object[] objArr) {
            return this.f69427d.mo35012b(call);
        }
    }

    public static final class SuspendForBody<ResponseT> extends HttpServiceMethod<ResponseT, Object> {

        /* renamed from: d */
        public final CallAdapter<ResponseT, Call<ResponseT>> f69428d;

        /* renamed from: e */
        public final boolean f69429e;

        public SuspendForBody(RequestFactory requestFactory, Call.Factory factory, Converter<ResponseBody, ResponseT> converter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter, boolean z) {
            super(requestFactory, factory, converter);
            this.f69428d = callAdapter;
            this.f69429e = z;
        }

        @Override // retrofit2.HttpServiceMethod
        /* renamed from: c */
        public Object mo35019c(Call<ResponseT> call, Object[] objArr) {
            final Call mo35012b = this.f69428d.mo35012b(call);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                if (this.f69429e) {
                    final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.m32122b(continuation), 1);
                    cancellableContinuationImpl.mo33966r(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            Call.this.cancel();
                            return Unit.f63088a;
                        }
                    });
                    mo35012b.mo35010o0(new Callback<Object>() { // from class: retrofit2.KotlinExtensions$await$4$2
                        @Override // retrofit2.Callback
                        /* renamed from: a */
                        public void mo35016a(@NotNull Call<Object> call2, @NotNull Throwable t) {
                            Intrinsics.m32180i(call2, "call");
                            Intrinsics.m32180i(t, "t");
                            CancellableContinuation.this.mo31877j(ResultKt.m31891a(t));
                        }

                        @Override // retrofit2.Callback
                        /* renamed from: b */
                        public void mo35017b(@NotNull Call<Object> call2, @NotNull Response<Object> response) {
                            Intrinsics.m32180i(call2, "call");
                            Intrinsics.m32180i(response, "response");
                            if (response.m35033a()) {
                                CancellableContinuation.this.mo31877j(response.f69563b);
                            } else {
                                CancellableContinuation.this.mo31877j(ResultKt.m31891a(new HttpException(response)));
                            }
                        }
                    });
                    return cancellableContinuationImpl.m33992v();
                }
                final CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.m32122b(continuation), 1);
                cancellableContinuationImpl2.mo33966r(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Throwable th) {
                        Call.this.cancel();
                        return Unit.f63088a;
                    }
                });
                mo35012b.mo35010o0(new Callback<Object>() { // from class: retrofit2.KotlinExtensions$await$2$2
                    @Override // retrofit2.Callback
                    /* renamed from: a */
                    public void mo35016a(@NotNull Call<Object> call2, @NotNull Throwable t) {
                        Intrinsics.m32180i(call2, "call");
                        Intrinsics.m32180i(t, "t");
                        CancellableContinuation.this.mo31877j(ResultKt.m31891a(t));
                    }

                    @Override // retrofit2.Callback
                    /* renamed from: b */
                    public void mo35017b(@NotNull Call<Object> call2, @NotNull Response<Object> response) {
                        Intrinsics.m32180i(call2, "call");
                        Intrinsics.m32180i(response, "response");
                        if (!response.m35033a()) {
                            CancellableContinuation.this.mo31877j(ResultKt.m31891a(new HttpException(response)));
                            return;
                        }
                        Object obj = response.f69563b;
                        if (obj != null) {
                            CancellableContinuation.this.mo31877j(obj);
                            return;
                        }
                        Object tag = call2.request().tag(Invocation.class);
                        if (tag == null) {
                            Intrinsics.m32188q();
                            throw null;
                        }
                        Intrinsics.m32175d(tag, "call.request().tag(Invocation::class.java)!!");
                        Method method = ((Invocation) tag).f69431a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Response from ");
                        Intrinsics.m32175d(method, "method");
                        Class<?> declaringClass = method.getDeclaringClass();
                        Intrinsics.m32175d(declaringClass, "method.declaringClass");
                        sb.append(declaringClass.getName());
                        sb.append('.');
                        sb.append(method.getName());
                        sb.append(" was null but response body type was declared as non-null");
                        CancellableContinuation.this.mo31877j(ResultKt.m31891a(new KotlinNullPointerException(sb.toString())));
                    }
                });
                return cancellableContinuationImpl2.m33992v();
            } catch (Exception e2) {
                return KotlinExtensions.m35020a(e2, continuation);
            }
        }
    }

    public static final class SuspendForResponse<ResponseT> extends HttpServiceMethod<ResponseT, Object> {

        /* renamed from: d */
        public final CallAdapter<ResponseT, Call<ResponseT>> f69430d;

        public SuspendForResponse(RequestFactory requestFactory, Call.Factory factory, Converter<ResponseBody, ResponseT> converter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter) {
            super(requestFactory, factory, converter);
            this.f69430d = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        /* renamed from: c */
        public Object mo35019c(Call<ResponseT> call, Object[] objArr) {
            final Call mo35012b = this.f69430d.mo35012b(call);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.m32122b(continuation), 1);
                cancellableContinuationImpl.mo33966r(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Throwable th) {
                        Call.this.cancel();
                        return Unit.f63088a;
                    }
                });
                mo35012b.mo35010o0(new Callback<Object>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
                    @Override // retrofit2.Callback
                    /* renamed from: a */
                    public void mo35016a(@NotNull Call<Object> call2, @NotNull Throwable t) {
                        Intrinsics.m32180i(call2, "call");
                        Intrinsics.m32180i(t, "t");
                        CancellableContinuation.this.mo31877j(ResultKt.m31891a(t));
                    }

                    @Override // retrofit2.Callback
                    /* renamed from: b */
                    public void mo35017b(@NotNull Call<Object> call2, @NotNull Response<Object> response) {
                        Intrinsics.m32180i(call2, "call");
                        Intrinsics.m32180i(response, "response");
                        CancellableContinuation.this.mo31877j(response);
                    }
                });
                return cancellableContinuationImpl.m33992v();
            } catch (Exception e2) {
                return KotlinExtensions.m35020a(e2, continuation);
            }
        }
    }

    public HttpServiceMethod(RequestFactory requestFactory, Call.Factory factory, Converter<ResponseBody, ResponseT> converter) {
        this.f69424a = requestFactory;
        this.f69425b = factory;
        this.f69426c = converter;
    }

    @Override // retrofit2.ServiceMethod
    @Nullable
    /* renamed from: a */
    public final ReturnT mo35018a(Object[] objArr) {
        return mo35019c(new OkHttpCall(this.f69424a, objArr, this.f69425b, this.f69426c), objArr);
    }

    @Nullable
    /* renamed from: c */
    public abstract ReturnT mo35019c(Call<ResponseT> call, Object[] objArr);
}
