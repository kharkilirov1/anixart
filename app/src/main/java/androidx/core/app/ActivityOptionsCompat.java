package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public class ActivityOptionsCompat {

    @RequiresApi
    public static class ActivityOptionsCompatImpl extends ActivityOptionsCompat {
        @Override // androidx.core.app.ActivityOptionsCompat
        /* renamed from: a */
        public Bundle mo1541a() {
            throw null;
        }
    }

    @RequiresApi
    public static class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static ActivityOptions m1542a(Context context, int i2, int i3) {
            return ActivityOptions.makeCustomAnimation(context, i2, i3);
        }

        @DoNotInline
        /* renamed from: b */
        public static ActivityOptions m1543b(View view, int i2, int i3, int i4, int i5) {
            return ActivityOptions.makeScaleUpAnimation(view, i2, i3, i4, i5);
        }

        @DoNotInline
        /* renamed from: c */
        public static ActivityOptions m1544c(View view, Bitmap bitmap, int i2, int i3) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i2, i3);
        }
    }

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static ActivityOptions m1545a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        @DoNotInline
        /* renamed from: b */
        public static ActivityOptions m1546b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        @DoNotInline
        /* renamed from: c */
        public static ActivityOptions m1547c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        /* renamed from: a */
        public static ActivityOptions m1548a() {
            return ActivityOptions.makeBasic();
        }

        @DoNotInline
        /* renamed from: b */
        public static ActivityOptions m1549b(View view, int i2, int i3, int i4, int i5) {
            return ActivityOptions.makeClipRevealAnimation(view, i2, i3, i4, i5);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m1550c(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* renamed from: a */
        public static Rect m1551a(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        @DoNotInline
        /* renamed from: b */
        public static ActivityOptions m1552b(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    @Nullable
    /* renamed from: a */
    public Bundle mo1541a() {
        return null;
    }
}
