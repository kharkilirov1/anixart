package androidx.appcompat.widget;

import android.content.res.Resources;
import android.widget.SpinnerAdapter;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public interface ThemedSpinnerAdapter extends SpinnerAdapter {

    public static final class Helper {
    }

    @Nullable
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@Nullable Resources.Theme theme);
}
