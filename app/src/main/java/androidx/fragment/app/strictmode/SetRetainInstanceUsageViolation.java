package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SetRetainInstanceUsageViolation.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/fragment/app/strictmode/SetRetainInstanceUsageViolation;", "Landroidx/fragment/app/strictmode/RetainInstanceUsageViolation;", "fragment_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SetRetainInstanceUsageViolation extends RetainInstanceUsageViolation {
    public SetRetainInstanceUsageViolation(@NotNull Fragment fragment) {
        super(fragment, "Attempting to set retain instance for fragment " + fragment);
    }
}
