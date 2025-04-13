package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p000a.C0000a;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: c */
    public static final String[] f3291c = {"_display_name", "_size"};

    /* renamed from: d */
    public static final File f3292d = new File("/");

    /* renamed from: e */
    @GuardedBy
    public static final HashMap<String, PathStrategy> f3293e = new HashMap<>();

    /* renamed from: b */
    public PathStrategy f3294b;

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static File[] m1698a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    public interface PathStrategy {
        /* renamed from: a */
        File mo1699a(Uri uri);

        /* renamed from: b */
        Uri mo1700b(File file);
    }

    public static class SimplePathStrategy implements PathStrategy {

        /* renamed from: a */
        public final String f3295a;

        /* renamed from: b */
        public final HashMap<String, File> f3296b = new HashMap<>();

        public SimplePathStrategy(String str) {
            this.f3295a = str;
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        /* renamed from: a */
        public File mo1699a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f3296b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException(C0000a.m12i("Unable to find configured root for ", uri));
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        /* renamed from: b */
        public Uri mo1700b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f3296b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException(C0000a.m14k("Failed to find configured root that contains ", canonicalPath));
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme("content").authority(this.f3295a).encodedPath(Uri.encode(entry.getKey()) + JsonPointer.SEPARATOR + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }
    }

    /* renamed from: a */
    public static PathStrategy m1695a(Context context, String str, int i2) {
        PathStrategy pathStrategy;
        HashMap<String, PathStrategy> hashMap = f3293e;
        synchronized (hashMap) {
            pathStrategy = hashMap.get(str);
            if (pathStrategy == null) {
                try {
                    try {
                        pathStrategy = m1697c(context, str, i2);
                        hashMap.put(str, pathStrategy);
                    } catch (XmlPullParserException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                } catch (IOException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return pathStrategy;
    }

    /* renamed from: b */
    public static Uri m1696b(@NonNull Context context, @NonNull String str, @NonNull File file) {
        return m1695a(context, str, 0).mo1700b(file);
    }

    /* renamed from: c */
    public static PathStrategy m1697c(Context context, String str, int i2) throws IOException, XmlPullParserException {
        SimplePathStrategy simplePathStrategy = new SimplePathStrategy(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider == null) {
            throw new IllegalArgumentException(C0000a.m14k("Couldn't find meta-data for provider with authority ", str));
        }
        if (resolveContentProvider.metaData == null && i2 != 0) {
            Bundle bundle = new Bundle(1);
            resolveContentProvider.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i2);
        }
        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                return simplePathStrategy;
            }
            if (next == 2) {
                String name = loadXmlMetaData.getName();
                File file = null;
                String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f3292d;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    Object obj = ContextCompat.f3288a;
                    File[] m1681b = ContextCompat.Api19Impl.m1681b(context, null);
                    if (m1681b.length > 0) {
                        file = m1681b[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    Object obj2 = ContextCompat.f3288a;
                    File[] m1680a = ContextCompat.Api19Impl.m1680a(context);
                    if (m1680a.length > 0) {
                        file = m1680a[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] m1698a = Api21Impl.m1698a(context);
                    if (m1698a.length > 0) {
                        file = m1698a[0];
                    }
                }
                if (file != null) {
                    String[] strArr = {attributeValue2};
                    for (int i3 = 0; i3 < 1; i3++) {
                        String str2 = strArr[i3];
                        if (str2 != null) {
                            file = new File(file, str2);
                        }
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        simplePathStrategy.f3296b.put(attributeValue, file.getCanonicalFile());
                    } catch (IOException e2) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e2);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        HashMap<String, PathStrategy> hashMap = f3293e;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
        this.f3294b = m1695a(context, str, 0);
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return this.f3294b.mo1699a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        File mo1699a = this.f3294b.mo1699a(uri);
        int lastIndexOf = mo1699a.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mo1699a.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, @NonNull ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint
    public ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        int i2;
        File mo1699a = this.f3294b.mo1699a(uri);
        if ("r".equals(str)) {
            i2 = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i2 = 738197504;
        } else if ("wa".equals(str)) {
            i2 = 704643072;
        } else if ("rw".equals(str)) {
            i2 = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(C0000a.m14k("Invalid mode: ", str));
            }
            i2 = 1006632960;
        }
        return ParcelFileDescriptor.open(mo1699a, i2);
    }

    @Override // android.content.ContentProvider
    @NonNull
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        int i2;
        File mo1699a = this.f3294b.mo1699a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f3291c;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i3 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i3] = "_display_name";
                i2 = i3 + 1;
                objArr[i3] = queryParameter == null ? mo1699a.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i3] = "_size";
                i2 = i3 + 1;
                objArr[i3] = Long.valueOf(mo1699a.length());
            }
            i3 = i2;
        }
        String[] strArr4 = new String[i3];
        System.arraycopy(strArr3, 0, strArr4, 0, i3);
        Object[] objArr2 = new Object[i3];
        System.arraycopy(objArr, 0, objArr2, 0, i3);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @NonNull ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
