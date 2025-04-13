package androidx.core.net;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class MailTo {

    /* renamed from: a */
    public HashMap<String, String> f3455a = new HashMap<>();

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("mailto:");
        sb.append('?');
        for (Map.Entry<String, String> entry : this.f3455a.entrySet()) {
            sb.append(Uri.encode(entry.getKey()));
            sb.append('=');
            sb.append(Uri.encode(entry.getValue()));
            sb.append('&');
        }
        return sb.toString();
    }
}
