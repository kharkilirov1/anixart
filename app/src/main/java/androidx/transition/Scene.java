package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class Scene {

    /* renamed from: a */
    public ViewGroup f6249a;

    /* renamed from: b */
    public View f6250b;

    /* renamed from: c */
    public Runnable f6251c;

    public Scene(@NonNull ViewGroup viewGroup, @NonNull View view) {
        this.f6249a = viewGroup;
        this.f6250b = view;
    }

    @Nullable
    /* renamed from: b */
    public static Scene m4219b(@NonNull ViewGroup viewGroup) {
        return (Scene) viewGroup.getTag(C2507R.id.transition_current_scene);
    }

    /* renamed from: a */
    public void m4220a() {
        if (this.f6250b != null) {
            this.f6249a.removeAllViews();
            this.f6249a.addView(this.f6250b);
        }
        this.f6249a.setTag(C2507R.id.transition_current_scene, this);
    }
}
