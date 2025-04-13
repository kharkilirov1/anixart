package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActivityResultCaller.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\t\n\u0000\n\u0002\b\u0005*\u0001\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31884d2 = {"<anonymous>", "androidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1", "I", "O", "invoke", "()Landroidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1;"}, m31885k = 3, m31886mv = {1, 4, 1})
/* loaded from: classes.dex */
final class ActivityResultCallerLauncher$resultContract$2 extends Lambda implements Function0<C00491> {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public C00491 invoke() {
        return new ActivityResultContract<Unit, Object>() { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2.1
            @Override // androidx.activity.result.contract.ActivityResultContract
            /* renamed from: a */
            public Intent mo317a(Context context, Unit unit) {
                Intrinsics.m32179h(context, "context");
                Objects.requireNonNull(ActivityResultCallerLauncher$resultContract$2.this);
                Objects.requireNonNull(null);
                throw null;
            }

            @Override // androidx.activity.result.contract.ActivityResultContract
            /* renamed from: c */
            public Object mo318c(int i2, @Nullable Intent intent) {
                Objects.requireNonNull(ActivityResultCallerLauncher$resultContract$2.this);
                Objects.requireNonNull(null);
                throw null;
            }
        };
    }
}
