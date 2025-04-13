package androidx.core.view.accessibility;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public interface AccessibilityViewCommand {

    public static abstract class CommandArguments {
    }

    public static final class MoveAtGranularityArguments extends CommandArguments {
    }

    public static final class MoveHtmlArguments extends CommandArguments {
    }

    public static final class MoveWindowArguments extends CommandArguments {
    }

    public static final class ScrollToPositionArguments extends CommandArguments {
    }

    public static final class SetProgressArguments extends CommandArguments {
    }

    public static final class SetSelectionArguments extends CommandArguments {
    }

    public static final class SetTextArguments extends CommandArguments {
    }

    /* renamed from: d */
    boolean mo2531d(@NonNull View view, @Nullable CommandArguments commandArguments);
}
