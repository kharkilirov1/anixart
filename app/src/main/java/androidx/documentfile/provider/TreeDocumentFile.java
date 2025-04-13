package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class TreeDocumentFile extends DocumentFile {

    /* renamed from: a */
    public Context f3921a;

    /* renamed from: b */
    public Uri f3922b;

    public TreeDocumentFile(@Nullable DocumentFile documentFile, Context context, Uri uri) {
        super(documentFile);
        this.f3921a = context;
        this.f3922b = uri;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @Nullable
    /* renamed from: a */
    public DocumentFile mo2750a(String str, String str2) {
        Uri uri;
        try {
            uri = DocumentsContract.createDocument(this.f3921a.getContentResolver(), this.f3922b, str, str2);
        } catch (Exception unused) {
            uri = null;
        }
        if (uri != null) {
            return new TreeDocumentFile(this, this.f3921a, uri);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    /* renamed from: d */
    public Uri mo2751d() {
        return this.f3922b;
    }
}
