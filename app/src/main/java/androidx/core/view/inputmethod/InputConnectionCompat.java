package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.inputmethod.InputContentInfoCompat;

@SuppressLint
/* loaded from: classes.dex */
public final class InputConnectionCompat {

    @RequiresApi
    public static class Api25Impl {
        @DoNotInline
        /* renamed from: a */
        public static boolean m2556a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i2, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i2, bundle);
        }
    }

    public interface OnCommitContentListener {
        /* renamed from: e */
        boolean mo2557e(@NonNull InputContentInfoCompat inputContentInfoCompat, int i2, @Nullable Bundle bundle);
    }

    @Deprecated
    public InputConnectionCompat() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* renamed from: a */
    public static InputConnection m2555a(@NonNull View view, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        String[] stringArray;
        InputConnectionWrapper inputConnectionWrapper;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final C0273a c0273a = new C0273a(view, 0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25) {
            inputConnectionWrapper = new InputConnectionWrapper(inputConnection, objArr2 == true ? 1 : 0) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.1
                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
                    OnCommitContentListener onCommitContentListener = c0273a;
                    InputContentInfoCompat inputContentInfoCompat = null;
                    if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
                        inputContentInfoCompat = new InputContentInfoCompat(new InputContentInfoCompat.InputContentInfoCompatApi25Impl(inputContentInfo));
                    }
                    if (onCommitContentListener.mo2557e(inputContentInfoCompat, i3, bundle)) {
                        return true;
                    }
                    return super.commitContent(inputContentInfo, i3, bundle);
                }
            };
        } else {
            if (i2 >= 25) {
                stringArray = editorInfo.contentMimeTypes;
                if (stringArray == null) {
                    stringArray = EditorInfoCompat.f3776a;
                }
            } else {
                Bundle bundle = editorInfo.extras;
                if (bundle == null) {
                    stringArray = EditorInfoCompat.f3776a;
                } else {
                    stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                    if (stringArray == null) {
                        stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                    }
                    if (stringArray == null) {
                        stringArray = EditorInfoCompat.f3776a;
                    }
                }
            }
            if (stringArray.length == 0) {
                return inputConnection;
            }
            inputConnectionWrapper = new InputConnectionWrapper(inputConnection, objArr == true ? 1 : 0) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.2
                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public boolean performPrivateCommand(String str, Bundle bundle2) {
                    boolean z;
                    ResultReceiver resultReceiver;
                    OnCommitContentListener onCommitContentListener = c0273a;
                    boolean z2 = false;
                    z2 = false;
                    z2 = false;
                    z2 = false;
                    if (bundle2 != null) {
                        if (!TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                            z = TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str);
                        }
                        try {
                            resultReceiver = (ResultReceiver) bundle2.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                            try {
                                Uri uri = (Uri) bundle2.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                                ClipDescription clipDescription = (ClipDescription) bundle2.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                                Uri uri2 = (Uri) bundle2.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                                int i3 = bundle2.getInt(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                                Bundle bundle3 = (Bundle) bundle2.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                                if (uri != null && clipDescription != null) {
                                    z2 = onCommitContentListener.mo2557e(new InputContentInfoCompat(uri, clipDescription, uri2), i3, bundle3);
                                }
                                if (resultReceiver != null) {
                                    resultReceiver.send(z2 ? 1 : 0, null);
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (resultReceiver != null) {
                                    resultReceiver.send(0, null);
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            resultReceiver = null;
                        }
                    }
                    if (z2) {
                        return true;
                    }
                    return super.performPrivateCommand(str, bundle2);
                }
            };
        }
        return inputConnectionWrapper;
    }
}
