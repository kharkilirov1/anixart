package com.google.android.play.core.splitcompat;

import android.app.Application;
import android.content.Context;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public class SplitCompatApplication extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        SplitCompat.m10935c(this, false);
    }
}
