package com.google.firebase.auth;

import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zzo implements OnCompleteListener {
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        if (task.mo9712q()) {
            String str = ((com.google.firebase.auth.internal.zze) task.mo9708m()).f22409a;
            String str2 = ((com.google.firebase.auth.internal.zze) task.mo9708m()).f22410b;
        } else {
            Log.e("FirebaseAuth", "Error while validating application identity: ".concat(String.valueOf(task.mo9707l() != null ? task.mo9707l().getMessage() : "")));
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
        }
        throw null;
    }
}
