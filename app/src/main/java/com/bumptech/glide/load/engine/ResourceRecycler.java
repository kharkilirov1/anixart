package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
class ResourceRecycler {

    /* renamed from: a */
    public boolean f8314a;

    /* renamed from: b */
    public final Handler f8315b = new Handler(Looper.getMainLooper(), new ResourceRecyclerCallback());

    public static final class ResourceRecyclerCallback implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((Resource) message.obj).mo5044c();
            return true;
        }
    }

    /* renamed from: a */
    public synchronized void m5058a(Resource<?> resource) {
        if (this.f8314a) {
            this.f8315b.obtainMessage(1, resource).sendToTarget();
        } else {
            this.f8314a = true;
            resource.mo5044c();
            this.f8314a = false;
        }
    }
}
