package androidx.core.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class DocumentsContractCompat {

    public static final class DocumentCompat {
    }

    @RequiresApi
    public static class DocumentsContractApi19Impl {
        @DoNotInline
        /* renamed from: a */
        public static Uri m1980a(String str, String str2) {
            return DocumentsContract.buildDocumentUri(str, str2);
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m1981b(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
            return DocumentsContract.deleteDocument(contentResolver, uri);
        }

        @DoNotInline
        /* renamed from: c */
        public static String m1982c(Uri uri) {
            return DocumentsContract.getDocumentId(uri);
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m1983d(Context context, @Nullable Uri uri) {
            return DocumentsContract.isDocumentUri(context, uri);
        }
    }

    @RequiresApi
    public static class DocumentsContractApi21Impl {
        @DoNotInline
        /* renamed from: a */
        public static Uri m1984a(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        @DoNotInline
        /* renamed from: b */
        public static Uri m1985b(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        @DoNotInline
        /* renamed from: c */
        public static Uri m1986c(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        @DoNotInline
        /* renamed from: d */
        public static Uri m1987d(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        @DoNotInline
        /* renamed from: e */
        public static Uri m1988e(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        @DoNotInline
        /* renamed from: f */
        public static String m1989f(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        @DoNotInline
        /* renamed from: g */
        public static Uri m1990g(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    @RequiresApi
    public static class DocumentsContractApi24Impl {
        @DoNotInline
        /* renamed from: a */
        public static boolean m1991a(@NonNull Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m1992b(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }
}
