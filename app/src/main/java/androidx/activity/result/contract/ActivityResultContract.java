package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActivityResultContract.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContract;", "I", "O", "", "SynchronousResult", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class ActivityResultContract<I, O> {

    /* compiled from: ActivityResultContract.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "T", "", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class SynchronousResult<T> {

        /* renamed from: a */
        public final T f272a;

        public SynchronousResult(T t) {
            this.f272a = t;
        }
    }

    @NotNull
    /* renamed from: a */
    public abstract Intent mo317a(@NotNull Context context, I i2);

    @Nullable
    /* renamed from: b */
    public SynchronousResult<O> mo325b(@NotNull Context context, I i2) {
        Intrinsics.m32179h(context, "context");
        return null;
    }

    /* renamed from: c */
    public abstract O mo318c(int i2, @Nullable Intent intent);
}
