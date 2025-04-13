package com.yandex.mobile.ads.impl;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class iq0 {

    /* renamed from: a */
    @NonNull
    private final zf1 f51361a;

    /* renamed from: b */
    @NonNull
    private final qc1 f51362b;

    /* renamed from: c */
    @NonNull
    private final cf1 f51363c;

    /* renamed from: d */
    @NonNull
    private final ul0 f51364d;

    /* renamed from: e */
    @NonNull
    private final C5244a f51365e = new C5244a(this, 0);

    /* renamed from: com.yandex.mobile.ads.impl.iq0$a */
    public class C5244a implements wc1 {

        /* renamed from: a */
        @Nullable
        private wc1 f51366a;

        private C5244a() {
        }

        /* renamed from: a */
        public final void m25595a(@Nullable wc1 wc1Var) {
            this.f51366a = wc1Var;
        }

        @Override // com.yandex.mobile.ads.impl.wc1
        /* renamed from: b */
        public final void mo25596b() {
            sl0 m23881b = iq0.this.f51361a.m23881b();
            if (m23881b != null) {
                rk0 m28319a = m23881b.m28319a();
                ul0 ul0Var = iq0.this.f51364d;
                PlaybackControlsContainer m27939a = m28319a.m27939a();
                Objects.requireNonNull(ul0Var);
                if (m27939a != null) {
                    CheckBox checkBox = (CheckBox) m27939a.findViewById(C4632R.id.video_mute_control);
                    if (checkBox != null) {
                        checkBox.setOnClickListener(null);
                        checkBox.setVisibility(8);
                    }
                    ProgressBar progressBar = (ProgressBar) m27939a.findViewById(C4632R.id.video_progress_control);
                    if (progressBar != null) {
                        progressBar.setProgress(0);
                        progressBar.setVisibility(8);
                    }
                    TextView textView = (TextView) m27939a.findViewById(C4632R.id.video_count_down_control);
                    if (textView != null) {
                        textView.setText("");
                        textView.setVisibility(8);
                    }
                    m27939a.setVisibility(8);
                }
            }
            wc1 wc1Var = this.f51366a;
            if (wc1Var != null) {
                wc1Var.mo25596b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.wc1
        /* renamed from: c */
        public final void mo25597c() {
            sl0 m23881b = iq0.this.f51361a.m23881b();
            if (m23881b != null) {
                iq0.this.f51363c.m23248a(m23881b);
            }
            wc1 wc1Var = this.f51366a;
            if (wc1Var != null) {
                wc1Var.mo25597c();
            }
        }

        public /* synthetic */ C5244a(iq0 iq0Var, int i2) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.wc1
        /* renamed from: a */
        public final void mo25594a() {
            wc1 wc1Var = this.f51366a;
            if (wc1Var != null) {
                wc1Var.mo25594a();
            }
        }
    }

    public iq0(@NonNull zf1 zf1Var, @NonNull qc1 qc1Var, @NonNull ul0 ul0Var, @NonNull hs0 hs0Var) {
        this.f51361a = zf1Var;
        this.f51362b = qc1Var;
        this.f51364d = ul0Var;
        this.f51363c = new cf1(ul0Var, hs0Var);
    }

    /* renamed from: a */
    public final void m25591a() {
        this.f51362b.mo24925a(this.f51365e);
        this.f51362b.play();
    }

    /* renamed from: a */
    public final void m25592a(@NonNull sl0 sl0Var) {
        this.f51362b.stop();
        rk0 m28319a = sl0Var.m28319a();
        ul0 ul0Var = this.f51364d;
        PlaybackControlsContainer m27939a = m28319a.m27939a();
        Objects.requireNonNull(ul0Var);
        if (m27939a != null) {
            CheckBox checkBox = (CheckBox) m27939a.findViewById(C4632R.id.video_mute_control);
            if (checkBox != null) {
                checkBox.setOnClickListener(null);
                checkBox.setVisibility(8);
            }
            ProgressBar progressBar = (ProgressBar) m27939a.findViewById(C4632R.id.video_progress_control);
            if (progressBar != null) {
                progressBar.setProgress(0);
                progressBar.setVisibility(8);
            }
            TextView textView = (TextView) m27939a.findViewById(C4632R.id.video_count_down_control);
            if (textView != null) {
                textView.setText("");
                textView.setVisibility(8);
            }
            m27939a.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void m25593a(@Nullable wc1 wc1Var) {
        this.f51365e.m25595a(wc1Var);
    }
}
