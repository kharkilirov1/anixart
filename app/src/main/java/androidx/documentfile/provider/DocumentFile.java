package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class DocumentFile {
    public DocumentFile(@Nullable DocumentFile documentFile) {
    }

    @Nullable
    /* renamed from: b */
    public static DocumentFile m2748b(@NonNull Context context, @NonNull Uri uri) {
        return new SingleDocumentFile(null, context, uri);
    }

    @Nullable
    /* renamed from: c */
    public static DocumentFile m2749c(@NonNull Context context, @NonNull Uri uri) {
        return new TreeDocumentFile(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    @Nullable
    /* renamed from: a */
    public abstract DocumentFile mo2750a(@NonNull String str, @NonNull String str2);

    @NonNull
    /* renamed from: d */
    public abstract Uri mo2751d();
}
