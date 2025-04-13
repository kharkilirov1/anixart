package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import androidx.annotation.RestrictTo;
import com.swiftsoft.anixartd.C2507R;

@RestrictTo
/* loaded from: classes.dex */
public class ActionBarPolicy {

    /* renamed from: a */
    public Context f678a;

    public ActionBarPolicy(Context context) {
        this.f678a = context;
    }

    /* renamed from: a */
    public int m525a() {
        Configuration configuration = this.f678a.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600) {
            return 5;
        }
        if (i2 > 960 && i3 > 720) {
            return 5;
        }
        if (i2 > 720 && i3 > 960) {
            return 5;
        }
        if (i2 >= 500) {
            return 4;
        }
        if (i2 > 640 && i3 > 480) {
            return 4;
        }
        if (i2 <= 480 || i3 <= 640) {
            return i2 >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: b */
    public boolean m526b() {
        return this.f678a.getResources().getBoolean(C2507R.bool.abc_action_bar_embed_tabs);
    }
}
