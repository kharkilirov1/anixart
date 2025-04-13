package androidx.documentfile.provider;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import p000a.C0000a;

/* loaded from: classes.dex */
class RawDocumentFile extends DocumentFile {

    /* renamed from: a */
    public File f3919a;

    public RawDocumentFile(@Nullable DocumentFile documentFile, File file) {
        super(documentFile);
        this.f3919a = file;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @Nullable
    /* renamed from: a */
    public DocumentFile mo2750a(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = C0000a.m16m(str2, ".", extensionFromMimeType);
        }
        File file = new File(this.f3919a, str2);
        try {
            file.createNewFile();
            return new RawDocumentFile(this, file);
        } catch (IOException e2) {
            Log.w("DocumentFile", "Failed to createFile: " + e2);
            return null;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    /* renamed from: d */
    public Uri mo2751d() {
        return Uri.fromFile(this.f3919a);
    }
}
