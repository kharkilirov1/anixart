package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ActivityStack.kt */
@ExperimentalWindowApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/embedding/ActivityStack;", "", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ActivityStack {

    /* renamed from: a */
    @NotNull
    public final List<Activity> f6707a;

    /* renamed from: b, reason: from toString */
    public final boolean isEmpty;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityStack(@NotNull List<? extends Activity> list, boolean z) {
        this.f6707a = list;
        this.isEmpty = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStack)) {
            return false;
        }
        ActivityStack activityStack = (ActivityStack) obj;
        return (Intrinsics.m32174c(this.f6707a, activityStack.f6707a) || this.isEmpty == activityStack.isEmpty) ? false : true;
    }

    public int hashCode() {
        return this.f6707a.hashCode() + ((this.isEmpty ? 1 : 0) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ActivityStack{");
        m24u.append(Intrinsics.m32187p("activities=", this.f6707a));
        m24u.append("isEmpty=" + this.isEmpty + '}');
        String sb = m24u.toString();
        Intrinsics.m32178g(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }
}
