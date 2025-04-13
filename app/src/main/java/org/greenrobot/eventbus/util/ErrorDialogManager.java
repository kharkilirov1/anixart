package org.greenrobot.eventbus.util;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes3.dex */
public class ErrorDialogManager {

    @TargetApi
    public static class HoneycombManagerFragment extends Fragment {
        @Override // android.app.Fragment
        public void onPause() {
            throw null;
        }

        @Override // android.app.Fragment
        public void onResume() {
            super.onResume();
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public static class SupportManagerFragment extends androidx.fragment.app.Fragment {
        @Override // androidx.fragment.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // androidx.fragment.app.Fragment
        public void onPause() {
            throw null;
        }

        @Override // androidx.fragment.app.Fragment
        public void onResume() {
            super.onResume();
            Objects.requireNonNull(null);
            throw null;
        }
    }
}
