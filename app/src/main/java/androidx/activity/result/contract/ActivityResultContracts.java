package androidx.activity.result.contract;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ActivityResultContracts.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts;", "", "CaptureVideo", "CreateDocument", "GetContent", "GetMultipleContents", "OpenDocument", "OpenDocumentTree", "OpenMultipleDocuments", "PickContact", "RequestMultiplePermissions", "RequestPermission", "StartActivityForResult", "StartIntentSenderForResult", "TakePicture", "TakePicturePreview", "TakeVideo", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ActivityResultContracts {

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$CaptureVideo;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static class CaptureVideo extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: a */
        public Intent mo317a(Context context, Uri uri) {
            Uri input = uri;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            Intrinsics.m32178g(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: b */
        public ActivityResultContract.SynchronousResult<Boolean> mo325b(Context context, Uri uri) {
            Uri input = uri;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: c */
        public Boolean mo318c(int i2, Intent intent) {
            return Boolean.valueOf(i2 == -1);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$CreateDocument;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/net/Uri;", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    @RequiresApi
    public static class CreateDocument extends ActivityResultContract<String, Uri> {

        /* renamed from: a */
        @NotNull
        public final String f273a = "*/*";

        @Deprecated
        public CreateDocument() {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: a */
        public Intent mo317a(Context context, String str) {
            String input = str;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f273a).putExtra("android.intent.extra.TITLE", input);
            Intrinsics.m32178g(putExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return putExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: b */
        public ActivityResultContract.SynchronousResult<Uri> mo325b(Context context, String str) {
            String input = str;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: c */
        public Uri mo318c(int i2, Intent intent) {
            if (!(i2 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetContent;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/net/Uri;", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static class GetContent extends ActivityResultContract<String, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: a */
        public Intent mo317a(Context context, String str) {
            String input = str;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
            Intrinsics.m32178g(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: b */
        public ActivityResultContract.SynchronousResult<Uri> mo325b(Context context, String str) {
            String input = str;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: c */
        public Uri mo318c(int i2, Intent intent) {
            if (!(i2 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u0006¨\u0006\u0007"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "Companion", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    @RequiresApi
    public static class GetMultipleContents extends ActivityResultContract<String, List<Uri>> {

        /* renamed from: a */
        @NotNull
        public static final Companion f274a = new Companion(null);

        /* compiled from: ActivityResultContracts.kt */
        @RequiresApi
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents$Companion;", "", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
        public static final class Companion {
            public Companion() {
            }

            @NotNull
            /* renamed from: a */
            public final List<Uri> m326a(@NotNull Intent intent) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return EmptyList.f63144b;
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        Uri uri = clipData.getItemAt(i2).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: a */
        public Intent mo317a(Context context, String str) {
            String input = str;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            Intrinsics.m32178g(putExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return putExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: b */
        public ActivityResultContract.SynchronousResult<List<Uri>> mo325b(Context context, String str) {
            String input = str;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: c */
        public List<Uri> mo318c(int i2, Intent intent) {
            if (!(i2 == -1)) {
                intent = null;
            }
            return intent != null ? f274a.m326a(intent) : EmptyList.f63144b;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¨\u0006\u0005"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenDocument;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    @RequiresApi
    public static class OpenDocument extends ActivityResultContract<String[], Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: a */
        public Intent mo317a(Context context, String[] strArr) {
            String[] input = strArr;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
            Intrinsics.m32178g(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: b */
        public ActivityResultContract.SynchronousResult<Uri> mo325b(Context context, String[] strArr) {
            String[] input = strArr;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: c */
        public Uri mo318c(int i2, Intent intent) {
            if (!(i2 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    @RequiresApi
    public static class OpenDocumentTree extends ActivityResultContract<Uri, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: a */
        public Intent mo317a(Context context, Uri uri) {
            Uri uri2 = uri;
            Intrinsics.m32179h(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && uri2 != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri2);
            }
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: b */
        public ActivityResultContract.SynchronousResult<Uri> mo325b(Context context, Uri uri) {
            Intrinsics.m32179h(context, "context");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: c */
        public Uri mo318c(int i2, Intent intent) {
            if (!(i2 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001¨\u0006\u0007"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenMultipleDocuments;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    @RequiresApi
    public static class OpenMultipleDocuments extends ActivityResultContract<String[], List<Uri>> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: a */
        public Intent mo317a(Context context, String[] strArr) {
            String[] input = strArr;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            Intrinsics.m32178g(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: b */
        public ActivityResultContract.SynchronousResult<List<Uri>> mo325b(Context context, String[] strArr) {
            String[] input = strArr;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: c */
        public List<Uri> mo318c(int i2, Intent intent) {
            if (!(i2 == -1)) {
                intent = null;
            }
            return intent != null ? GetMultipleContents.f274a.m326a(intent) : EmptyList.f63144b;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickContact;", "Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Void;", "Landroid/net/Uri;", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class PickContact extends ActivityResultContract<Void, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: a */
        public Intent mo317a(Context context, Void r2) {
            Intrinsics.m32179h(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            Intrinsics.m32178g(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: c */
        public Uri mo318c(int i2, Intent intent) {
            if (!(i2 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001:\u0001\u0007¨\u0006\b"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Companion", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class RequestMultiplePermissions extends ActivityResultContract<String[], Map<String, Boolean>> {

        /* renamed from: a */
        @NotNull
        public static final Companion f275a = new Companion(null);

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions$Companion;", "", "", "ACTION_REQUEST_PERMISSIONS", "Ljava/lang/String;", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
        public static final class Companion {
            public Companion() {
            }

            @NotNull
            /* renamed from: a */
            public final Intent m327a(@NotNull String[] strArr) {
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                Intrinsics.m32178g(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: a */
        public Intent mo317a(Context context, String[] strArr) {
            String[] input = strArr;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            return f275a.m327a(input);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: b */
        public ActivityResultContract.SynchronousResult<Map<String, Boolean>> mo325b(Context context, String[] strArr) {
            Map map;
            String[] input = strArr;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            boolean z = true;
            if (input.length == 0) {
                map = EmptyMap.f63145b;
                return new ActivityResultContract.SynchronousResult<>(map);
            }
            int length = input.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (!(ContextCompat.m1668a(context, input[i2]) == 0)) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (!z) {
                return null;
            }
            int m32062g = MapsKt.m32062g(input.length);
            if (m32062g < 16) {
                m32062g = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(m32062g);
            for (String str : input) {
                linkedHashMap.put(str, Boolean.TRUE);
            }
            return new ActivityResultContract.SynchronousResult<>(linkedHashMap);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: c */
        public Map<String, Boolean> mo318c(int i2, Intent intent) {
            Map<String, Boolean> map;
            Map<String, Boolean> map2;
            Map<String, Boolean> map3;
            if (i2 != -1) {
                map3 = EmptyMap.f63145b;
                return map3;
            }
            if (intent == null) {
                map2 = EmptyMap.f63145b;
                return map2;
            }
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                map = EmptyMap.f63145b;
                return map;
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i3 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i3 == 0));
            }
            return MapsKt.m32067l(CollectionsKt.m32039p0(ArraysKt.m31975y(stringArrayExtra), arrayList));
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class RequestPermission extends ActivityResultContract<String, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: a */
        public Intent mo317a(Context context, String str) {
            String input = str;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            return RequestMultiplePermissions.f275a.m327a(new String[]{input});
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: b */
        public ActivityResultContract.SynchronousResult<Boolean> mo325b(Context context, String str) {
            String input = str;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            if (ContextCompat.m1668a(context, input) == 0) {
                return new ActivityResultContract.SynchronousResult<>(Boolean.TRUE);
            }
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: c */
        public Boolean mo318c(int i2, Intent intent) {
            boolean z;
            if (intent == null || i2 != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean z2 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z = false;
                        break;
                    }
                    if (intArrayExtra[i3] == 0) {
                        z = true;
                        break;
                    }
                    i3++;
                }
                if (z) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "Companion", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class StartActivityForResult extends ActivityResultContract<Intent, ActivityResult> {

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult$Companion;", "", "", "EXTRA_ACTIVITY_OPTIONS_BUNDLE", "Ljava/lang/String;", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
        public static final class Companion {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: a */
        public Intent mo317a(Context context, Intent intent) {
            Intent input = intent;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            return input;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: c */
        public ActivityResult mo318c(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartIntentSenderForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "Companion", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class StartIntentSenderForResult extends ActivityResultContract<IntentSenderRequest, ActivityResult> {

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartIntentSenderForResult$Companion;", "", "", "ACTION_INTENT_SENDER_REQUEST", "Ljava/lang/String;", "EXTRA_INTENT_SENDER_REQUEST", "EXTRA_SEND_INTENT_EXCEPTION", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
        public static final class Companion {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: a */
        public Intent mo317a(Context context, IntentSenderRequest intentSenderRequest) {
            IntentSenderRequest input = intentSenderRequest;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
            Intrinsics.m32178g(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return putExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: c */
        public ActivityResult mo318c(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static class TakePicture extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: a */
        public Intent mo317a(Context context, Uri uri) {
            Uri input = uri;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
            Intrinsics.m32178g(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: b */
        public ActivityResultContract.SynchronousResult<Boolean> mo325b(Context context, Uri uri) {
            Uri input = uri;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: c */
        public Boolean mo318c(int i2, Intent intent) {
            return Boolean.valueOf(i2 == -1);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview;", "Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static class TakePicturePreview extends ActivityResultContract<Void, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: a */
        public Intent mo317a(Context context, Void r2) {
            Intrinsics.m32179h(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: b */
        public ActivityResultContract.SynchronousResult<Bitmap> mo325b(Context context, Void r2) {
            Intrinsics.m32179h(context, "context");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: c */
        public Bitmap mo318c(int i2, Intent intent) {
            if (!(i2 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakeVideo;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    @Deprecated
    public static class TakeVideo extends ActivityResultContract<Uri, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: a */
        public Intent mo317a(Context context, Uri uri) {
            Uri input = uri;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            Intrinsics.m32178g(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: b */
        public ActivityResultContract.SynchronousResult<Bitmap> mo325b(Context context, Uri uri) {
            Uri input = uri;
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: c */
        public Bitmap mo318c(int i2, Intent intent) {
            if (!(i2 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }
}
