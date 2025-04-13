package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class SingleDocumentFile extends DocumentFile {

    /* renamed from: a */
    public Uri f3920a;

    public SingleDocumentFile(@Nullable DocumentFile documentFile, Context context, Uri uri) {
        super(null);
        this.f3920a = uri;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    /* renamed from: a */
    public DocumentFile mo2750a(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    /* renamed from: d */
    public Uri mo2751d() {
        return this.f3920a;
    }
}
