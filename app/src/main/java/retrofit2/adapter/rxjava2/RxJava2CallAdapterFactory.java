package retrofit2.adapter.rxjava2;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p000a.C0000a;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

/* loaded from: classes3.dex */
public final class RxJava2CallAdapterFactory extends CallAdapter.Factory {

    /* renamed from: a */
    @Nullable
    public final Scheduler f69614a = null;

    /* renamed from: b */
    public final boolean f69615b;

    public RxJava2CallAdapterFactory(@Nullable Scheduler scheduler, boolean z) {
        this.f69615b = z;
    }

    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    /* renamed from: a */
    public CallAdapter<?, ?> mo35015a(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Type type2;
        boolean z;
        boolean z2;
        Type m35013b;
        Class<?> m35014c = CallAdapter.Factory.m35014c(type);
        if (m35014c == Completable.class) {
            return new RxJava2CallAdapter(Void.class, this.f69614a, this.f69615b, false, true, false, false, false, true);
        }
        boolean z3 = true;
        boolean z4 = m35014c == Flowable.class;
        boolean z5 = m35014c == Single.class;
        boolean z6 = m35014c == Maybe.class;
        if (m35014c != Observable.class && !z4 && !z5 && !z6) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z4 ? !z5 ? z6 ? "Maybe" : "Observable" : "Single" : "Flowable";
            StringBuilder m29z = C0000a.m29z(str, " return type must be parameterized as ", str, "<Foo> or ", str);
            m29z.append("<? extends Foo>");
            throw new IllegalStateException(m29z.toString());
        }
        Type m35013b2 = CallAdapter.Factory.m35013b(0, (ParameterizedType) type);
        Class<?> m35014c2 = CallAdapter.Factory.m35014c(m35013b2);
        if (m35014c2 == Response.class) {
            if (!(m35013b2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            m35013b = CallAdapter.Factory.m35013b(0, (ParameterizedType) m35013b2);
            z3 = false;
        } else {
            if (m35014c2 != Result.class) {
                type2 = m35013b2;
                z = false;
                z2 = true;
                return new RxJava2CallAdapter(type2, this.f69614a, this.f69615b, z, z2, z4, z5, z6, false);
            }
            if (!(m35013b2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            m35013b = CallAdapter.Factory.m35013b(0, (ParameterizedType) m35013b2);
        }
        type2 = m35013b;
        z = z3;
        z2 = false;
        return new RxJava2CallAdapter(type2, this.f69614a, this.f69615b, z, z2, z4, z5, z6, false);
    }
}
