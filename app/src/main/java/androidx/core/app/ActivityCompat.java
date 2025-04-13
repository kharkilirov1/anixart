package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ActivityCompat extends ContextCompat {

    /* renamed from: c */
    public static final /* synthetic */ int f3100c = 0;

    @RequiresApi
    public static class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m1525a(Activity activity) {
            activity.finishAffinity();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m1526b(Activity activity, Intent intent, int i2, Bundle bundle) {
            activity.startActivityForResult(intent, i2, bundle);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m1527c(Activity activity, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
        }
    }

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m1528a(Activity activity) {
            activity.finishAfterTransition();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m1529b(Activity activity) {
            activity.postponeEnterTransition();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m1530c(Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m1531d(Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        @DoNotInline
        /* renamed from: e */
        public static void m1532e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    @RequiresApi
    public static class Api22Impl {
        @DoNotInline
        /* renamed from: a */
        public static Uri m1533a(Activity activity) {
            return activity.getReferrer();
        }
    }

    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m1534a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m1535b(Activity activity, String[] strArr, int i2) {
            activity.requestPermissions(strArr, i2);
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m1536c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        /* renamed from: a */
        public static <T> T m1537a(Activity activity, int i2) {
            return (T) activity.requireViewById(i2);
        }
    }

    @RequiresApi
    public static class Api30Impl {
        @DoNotInline
        /* renamed from: a */
        public static Display m1538a(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m1539b(@NonNull Activity activity, @Nullable LocusIdCompat locusIdCompat, @Nullable Bundle bundle) {
            activity.setLocusContext(locusIdCompat == null ? null : locusIdCompat.f3298b, bundle);
        }
    }

    @RequiresApi
    public static class Api31Impl {
        @DoNotInline
        /* renamed from: a */
        public static boolean m1540a(@NonNull Activity activity) {
            return activity.isLaunchedFromBubble();
        }
    }

    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int i2, @NonNull String[] strArr, @NonNull int[] iArr);
    }

    public interface PermissionCompatDelegate {
    }

    @RestrictTo
    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int i2);
    }

    @RequiresApi
    public static class SharedElementCallback21Impl extends android.app.SharedElementCallback {

        /* renamed from: a */
        public final SharedElementCallback f3104a;

        public SharedElementCallback21Impl(SharedElementCallback sharedElementCallback) {
            this.f3104a = sharedElementCallback;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            Bitmap bitmap;
            Bitmap bitmap2;
            SharedElementCallback sharedElementCallback = this.f3104a;
            Objects.requireNonNull(sharedElementCallback);
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                Drawable drawable = imageView.getDrawable();
                Drawable background = imageView.getBackground();
                if (drawable != null && background == null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                        bitmap2 = null;
                    } else {
                        float min = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
                        if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
                            bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                        } else {
                            int i2 = (int) (intrinsicWidth * min);
                            int i3 = (int) (intrinsicHeight * min);
                            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            Rect bounds = drawable.getBounds();
                            int i4 = bounds.left;
                            int i5 = bounds.top;
                            int i6 = bounds.right;
                            int i7 = bounds.bottom;
                            drawable.setBounds(0, 0, i2, i3);
                            drawable.draw(canvas);
                            drawable.setBounds(i4, i5, i6, i7);
                            bitmap2 = createBitmap;
                        }
                    }
                    if (bitmap2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("sharedElement:snapshot:bitmap", bitmap2);
                        bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                        if (imageView.getScaleType() != ImageView.ScaleType.MATRIX) {
                            return bundle;
                        }
                        float[] fArr = new float[9];
                        imageView.getImageMatrix().getValues(fArr);
                        bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                        return bundle;
                    }
                }
            }
            int round = Math.round(rectF.width());
            int round2 = Math.round(rectF.height());
            if (round <= 0 || round2 <= 0) {
                bitmap = null;
            } else {
                float min2 = Math.min(1.0f, 1048576.0f / (round * round2));
                int i8 = (int) (round * min2);
                int i9 = (int) (round2 * min2);
                if (sharedElementCallback.f3281a == null) {
                    sharedElementCallback.f3281a = new Matrix();
                }
                sharedElementCallback.f3281a.set(matrix);
                sharedElementCallback.f3281a.postTranslate(-rectF.left, -rectF.top);
                sharedElementCallback.f3281a.postScale(min2, min2);
                bitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmap);
                canvas2.concat(sharedElementCallback.f3281a);
                view.draw(canvas2);
            }
            return bitmap;
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            Objects.requireNonNull(this.f3104a);
            if (!(parcelable instanceof Bundle)) {
                if (!(parcelable instanceof Bitmap)) {
                    return null;
                }
                ImageView imageView = new ImageView(context);
                imageView.setImageBitmap((Bitmap) parcelable);
                return imageView;
            }
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
            if (bitmap == null) {
                return null;
            }
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageBitmap(bitmap);
            imageView2.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
            if (imageView2.getScaleType() != ImageView.ScaleType.MATRIX) {
                return imageView2;
            }
            float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
            Matrix matrix = new Matrix();
            matrix.setValues(floatArray);
            imageView2.setImageMatrix(matrix);
            return imageView2;
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            Objects.requireNonNull(this.f3104a);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            Objects.requireNonNull(this.f3104a);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            Objects.requireNonNull(this.f3104a);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            Objects.requireNonNull(this.f3104a);
        }

        @Override // android.app.SharedElementCallback
        @RequiresApi
        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            Objects.requireNonNull(this.f3104a);
            Api23Impl.m1534a(onSharedElementsReadyListener);
        }
    }

    /* renamed from: k */
    public static void m1515k(@NonNull Activity activity) {
        Api16Impl.m1525a(activity);
    }

    /* renamed from: l */
    public static void m1516l(@NonNull Activity activity) {
        Api21Impl.m1528a(activity);
    }

    /* renamed from: m */
    public static void m1517m(@NonNull Activity activity) {
        Api21Impl.m1529b(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static void m1518n(@NonNull final Activity activity, @NonNull final String[] strArr, @IntRange final int i2) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException(C0000a.m20q(C0000a.m24u("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof RequestPermissionsRequestCodeValidator) {
                ((RequestPermissionsRequestCodeValidator) activity).validateRequestPermissionsRequestCode(i2);
            }
            Api23Impl.m1535b(activity, strArr, i2);
        } else if (activity instanceof OnRequestPermissionsResultCallback) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.ActivityCompat.1
                @Override // java.lang.Runnable
                public void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = packageManager.checkPermission(strArr[i3], packageName);
                    }
                    ((OnRequestPermissionsResultCallback) activity).onRequestPermissionsResult(i2, strArr, iArr);
                }
            });
        }
    }

    /* renamed from: o */
    public static void m1519o(@NonNull Activity activity, @Nullable SharedElementCallback sharedElementCallback) {
        Api21Impl.m1530c(activity, sharedElementCallback != null ? new SharedElementCallback21Impl(sharedElementCallback) : null);
    }

    /* renamed from: p */
    public static void m1520p(@NonNull Activity activity, @Nullable SharedElementCallback sharedElementCallback) {
        Api21Impl.m1531d(activity, sharedElementCallback != null ? new SharedElementCallback21Impl(sharedElementCallback) : null);
    }

    /* renamed from: q */
    public static boolean m1521q(@NonNull Activity activity, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.m1536c(activity, str);
        }
        return false;
    }

    /* renamed from: r */
    public static void m1522r(@NonNull Activity activity, @NonNull Intent intent, int i2, @Nullable Bundle bundle) {
        Api16Impl.m1526b(activity, intent, i2, bundle);
    }

    /* renamed from: s */
    public static void m1523s(@NonNull Activity activity, @NonNull IntentSender intentSender, int i2, @Nullable Intent intent, int i3, int i4, int i5, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        Api16Impl.m1527c(activity, intentSender, i2, intent, i3, i4, i5, bundle);
    }

    /* renamed from: t */
    public static void m1524t(@NonNull Activity activity) {
        Api21Impl.m1532e(activity);
    }
}
