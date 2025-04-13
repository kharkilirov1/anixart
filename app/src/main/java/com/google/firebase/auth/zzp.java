package com.google.firebase.auth;

import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zzp implements OnCompleteListener {
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        if (task.mo9712q()) {
            String str = ((com.google.firebase.auth.internal.zze) task.mo9708m()).f22409a;
            String str2 = ((com.google.firebase.auth.internal.zze) task.mo9708m()).f22410b;
        } else {
            Log.e("FirebaseAuth", task.mo9707l() != null ? "Error while validating application identity: ".concat(String.valueOf(task.mo9707l().getMessage())) : "Error while validating application identity: ");
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
        }
        Objects.requireNonNull(null);
        throw null;
    }
}
