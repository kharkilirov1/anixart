package com.swiftsoft.anixartd.utils.cropper;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.cropper.CropImageView;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class CropImage {

    public static final class ActivityBuilder {

        /* renamed from: a */
        @Nullable
        public final Uri f30302a;

        /* renamed from: b */
        public final CropImageOptions f30303b = new CropImageOptions();

        public ActivityBuilder(Uri uri, C27731 c27731) {
            this.f30302a = uri;
        }

        /* renamed from: a */
        public void m16408a(@NonNull Context context, @NonNull Fragment fragment) {
            this.f30303b.m16414c();
            Intent intent = new Intent();
            intent.setClass(context, CropImageActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("CROP_IMAGE_EXTRA_SOURCE", this.f30302a);
            bundle.putParcelable("CROP_IMAGE_EXTRA_OPTIONS", this.f30303b);
            intent.putExtra("CROP_IMAGE_EXTRA_BUNDLE", bundle);
            fragment.startActivityForResult(intent, DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER);
        }
    }

    public static final class ActivityResult extends CropImageView.CropResult implements Parcelable {
        public static final Parcelable.Creator<ActivityResult> CREATOR = new Parcelable.Creator<ActivityResult>() { // from class: com.swiftsoft.anixartd.utils.cropper.CropImage.ActivityResult.1
            @Override // android.os.Parcelable.Creator
            public ActivityResult createFromParcel(Parcel parcel) {
                return new ActivityResult(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public ActivityResult[] newArray(int i2) {
                return new ActivityResult[i2];
            }
        };

        public ActivityResult(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i2, Rect rect2, int i3) {
            super(null, uri, null, uri2, exc, fArr, rect, rect2, i2, i3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f30406b, i2);
            parcel.writeParcelable(this.f30407c, i2);
            parcel.writeSerializable(this.f30408d);
            parcel.writeFloatArray(this.f30409e);
            parcel.writeParcelable(this.f30410f, i2);
            parcel.writeParcelable(this.f30411g, i2);
            parcel.writeInt(this.f30412h);
            parcel.writeInt(this.f30413i);
        }

        public ActivityResult(Parcel parcel) {
            super(null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Exception) parcel.readSerializable(), parcel.createFloatArray(), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }
    }

    /* renamed from: a */
    public static Uri m16403a(@NonNull Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            return Uri.fromFile(new File(externalCacheDir.getPath(), "pickImageResult.jpeg"));
        }
        return null;
    }

    /* renamed from: b */
    public static List<Intent> m16404b(@NonNull PackageManager packageManager, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Intent intent = str == "android.intent.action.GET_CONTENT" ? new Intent(str) : new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            arrayList.add(intent2);
        }
        if (!z) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Intent intent3 = (Intent) it.next();
                if (intent3.getComponent().getClassName().equals("com.android.documentsui.DocumentsActivity")) {
                    arrayList.remove(intent3);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static boolean m16405c(@NonNull Context context) {
        boolean z;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                for (String str : strArr) {
                    if (str.equalsIgnoreCase("android.permission.CAMERA")) {
                        z = true;
                        break;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        z = false;
        return z && context.checkSelfPermission("android.permission.CAMERA") != 0;
    }

    /* renamed from: d */
    public static boolean m16406d(@NonNull Context context, @NonNull Uri uri) {
        boolean z;
        if (Build.VERSION.SDK_INT < 23 || context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                openInputStream.close();
            }
            z = false;
        } catch (Exception unused) {
            z = true;
        }
        return z;
    }

    /* renamed from: e */
    public static void m16407e(@NonNull Activity activity) {
        Intent intent;
        String string = activity.getString(C2507R.string.pick_image_intent_chooser_title);
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = activity.getPackageManager();
        if (!m16405c(activity)) {
            ArrayList arrayList2 = new ArrayList();
            Uri m16403a = m16403a(activity);
            Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent2, 0)) {
                Intent intent3 = new Intent(intent2);
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                intent3.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                intent3.setPackage(resolveInfo.activityInfo.packageName);
                if (m16403a != null) {
                    intent3.putExtra("output", m16403a);
                }
                arrayList2.add(intent3);
            }
            arrayList.addAll(arrayList2);
        }
        List<Intent> m16404b = m16404b(packageManager, "android.intent.action.GET_CONTENT", false);
        if (((ArrayList) m16404b).size() == 0) {
            m16404b = m16404b(packageManager, "android.intent.action.PICK", false);
        }
        arrayList.addAll(m16404b);
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            intent = (Intent) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
        }
        Intent createChooser = Intent.createChooser(intent, string);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
        activity.startActivityForResult(createChooser, DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER);
    }
}
