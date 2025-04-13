package com.google.firebase.firestore.core;

import android.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ActivityScope {

    public static class StopListenerFragment extends Fragment {

        /* renamed from: b */
        public CallbackList f22675b = new CallbackList(null);

        @Override // android.app.Fragment
        public void onStop() {
            CallbackList callbackList;
            super.onStop();
            synchronized (this.f22675b) {
                callbackList = this.f22675b;
                this.f22675b = new CallbackList(null);
            }
            callbackList.m12391a();
        }
    }

    public static class StopListenerSupportFragment extends androidx.fragment.app.Fragment {

        /* renamed from: b */
        public CallbackList f22676b = new CallbackList(null);

        @Override // androidx.fragment.app.Fragment
        public void onStop() {
            CallbackList callbackList;
            super.onStop();
            synchronized (this.f22676b) {
                callbackList = this.f22676b;
                this.f22676b = new CallbackList(null);
            }
            callbackList.m12391a();
        }
    }

    public static class CallbackList {

        /* renamed from: a */
        public final List<Runnable> f22674a = new ArrayList();

        public CallbackList() {
        }

        /* renamed from: a */
        public void m12391a() {
            for (Runnable runnable : this.f22674a) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }

        public CallbackList(C20851 c20851) {
        }
    }
}
