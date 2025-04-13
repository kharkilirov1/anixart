package androidx.multidex;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.File;
import java.util.Set;
import p000a.C0000a;

/* loaded from: classes.dex */
public class MultiDexApplication extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        Set<File> set = MultiDex.f4881a;
        Log.i("MultiDex", "Installing application");
        try {
            if (MultiDex.f4882b) {
                Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
                return;
            }
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException e2) {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e2);
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            } else {
                MultiDex.m3323c(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir), "secondary-dexes", "", true);
                Log.i("MultiDex", "install done");
            }
        } catch (Exception e3) {
            Log.e("MultiDex", "MultiDex installation failure", e3);
            StringBuilder m24u = C0000a.m24u("MultiDex installation failed (");
            m24u.append(e3.getMessage());
            m24u.append(").");
            throw new RuntimeException(m24u.toString());
        }
    }
}
