package androidx.preference;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class PreferenceViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    @Nullable
    public final Drawable f5094a;

    /* renamed from: b */
    public ColorStateList f5095b;

    /* renamed from: c */
    public final SparseArray<View> f5096c;

    /* renamed from: d */
    public boolean f5097d;

    /* renamed from: e */
    public boolean f5098e;

    public PreferenceViewHolder(@NonNull View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f5096c = sparseArray;
        TextView textView = (TextView) view.findViewById(android.R.id.title);
        sparseArray.put(android.R.id.title, textView);
        sparseArray.put(android.R.id.summary, view.findViewById(android.R.id.summary));
        sparseArray.put(android.R.id.icon, view.findViewById(android.R.id.icon));
        sparseArray.put(C2507R.id.icon_frame, view.findViewById(C2507R.id.icon_frame));
        sparseArray.put(android.R.id.icon_frame, view.findViewById(android.R.id.icon_frame));
        this.f5094a = view.getBackground();
        if (textView != null) {
            this.f5095b = textView.getTextColors();
        }
    }

    /* renamed from: a */
    public View m3455a(@IdRes int i2) {
        View view = this.f5096c.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = this.itemView.findViewById(i2);
        if (findViewById != null) {
            this.f5096c.put(i2, findViewById);
        }
        return findViewById;
    }
}
