package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;

/* loaded from: classes3.dex */
public final class ul0 {

    /* renamed from: a */
    @NonNull
    private final tk0 f55554a;

    /* renamed from: b */
    @NonNull
    private final qe1 f55555b;

    /* renamed from: com.yandex.mobile.ads.impl.ul0$a */
    public static class ViewOnClickListenerC5872a implements View.OnClickListener {

        /* renamed from: a */
        @NonNull
        private final xk0 f55556a;

        /* renamed from: b */
        @NonNull
        private final CheckBox f55557b;

        /* renamed from: c */
        private boolean f55558c;

        public ViewOnClickListenerC5872a(@NonNull tk0 tk0Var, @NonNull CheckBox checkBox, @NonNull qe1 qe1Var) {
            this.f55557b = checkBox;
            this.f55558c = qe1Var.m27711a();
            this.f55556a = new xk0(tk0Var);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@NonNull View view) {
            boolean z = !this.f55558c;
            this.f55558c = z;
            this.f55557b.setChecked(z);
            this.f55556a.m29763a(this.f55558c);
        }
    }

    public ul0(@NonNull C5987ws c5987ws, @NonNull qe1 qe1Var) {
        this.f55554a = c5987ws;
        this.f55555b = qe1Var;
    }

    /* renamed from: a */
    public final void m29041a(@Nullable PlaybackControlsContainer playbackControlsContainer) {
        if (playbackControlsContainer != null) {
            CheckBox checkBox = (CheckBox) playbackControlsContainer.findViewById(C4632R.id.video_mute_control);
            if (checkBox != null) {
                checkBox.setOnClickListener(new ViewOnClickListenerC5872a(this.f55554a, checkBox, this.f55555b));
                checkBox.setVisibility(0);
            }
            ProgressBar progressBar = (ProgressBar) playbackControlsContainer.findViewById(C4632R.id.video_progress_control);
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            TextView textView = (TextView) playbackControlsContainer.findViewById(C4632R.id.video_count_down_control);
            if (textView != null) {
                textView.setText("");
                textView.setVisibility(0);
            }
            playbackControlsContainer.setVisibility(0);
        }
    }
}
