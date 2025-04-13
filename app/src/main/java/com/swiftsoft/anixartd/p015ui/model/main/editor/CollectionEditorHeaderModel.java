package com.swiftsoft.anixartd.p015ui.model.main.editor;

import android.content.Context;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.editor.CollectionEditorHeaderModel$descriptionTextWatcher$2;
import com.swiftsoft.anixartd.p015ui.model.main.editor.CollectionEditorHeaderModel$titleTextWatcher$2;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CollectionEditorHeaderModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/editor/CollectionEditorHeaderModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class CollectionEditorHeaderModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @Nullable
    public String f29662k;

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public String f29663l;

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public String f29664m;

    /* renamed from: n */
    @EpoxyAttribute
    @Nullable
    public File f29665n;

    /* renamed from: o */
    @EpoxyAttribute
    public boolean f29666o;

    /* renamed from: p */
    @EpoxyAttribute
    public long f29667p;

    /* renamed from: q */
    @EpoxyAttribute
    public Listener f29668q;

    /* renamed from: r */
    @NotNull
    public final Lazy f29669r = LazyKt.m31881b(new Function0<CollectionEditorHeaderModel$titleTextWatcher$2.C27561>() { // from class: com.swiftsoft.anixartd.ui.model.main.editor.CollectionEditorHeaderModel$titleTextWatcher$2
        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.swiftsoft.anixartd.ui.model.main.editor.CollectionEditorHeaderModel$titleTextWatcher$2$1] */
        @Override // kotlin.jvm.functions.Function0
        public C27561 invoke() {
            final CollectionEditorHeaderModel collectionEditorHeaderModel = CollectionEditorHeaderModel.this;
            return new TextWatcher() { // from class: com.swiftsoft.anixartd.ui.model.main.editor.CollectionEditorHeaderModel$titleTextWatcher$2.1
                @Override // android.text.TextWatcher
                public void afterTextChanged(@NotNull Editable text) {
                    Intrinsics.m32179h(text, "text");
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@NotNull CharSequence text, int i2, int i3, int i4) {
                    Intrinsics.m32179h(text, "text");
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@NotNull CharSequence text, int i2, int i3, int i4) {
                    Intrinsics.m32179h(text, "text");
                    CollectionEditorHeaderModel.this.m15955v2().mo14497a(text.toString());
                }
            };
        }
    });

    /* renamed from: s */
    @NotNull
    public final Lazy f29670s = LazyKt.m31881b(new Function0<CollectionEditorHeaderModel$descriptionTextWatcher$2.C27551>() { // from class: com.swiftsoft.anixartd.ui.model.main.editor.CollectionEditorHeaderModel$descriptionTextWatcher$2
        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.swiftsoft.anixartd.ui.model.main.editor.CollectionEditorHeaderModel$descriptionTextWatcher$2$1] */
        @Override // kotlin.jvm.functions.Function0
        public C27551 invoke() {
            final CollectionEditorHeaderModel collectionEditorHeaderModel = CollectionEditorHeaderModel.this;
            return new TextWatcher() { // from class: com.swiftsoft.anixartd.ui.model.main.editor.CollectionEditorHeaderModel$descriptionTextWatcher$2.1
                @Override // android.text.TextWatcher
                public void afterTextChanged(@NotNull Editable text) {
                    Intrinsics.m32179h(text, "text");
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@NotNull CharSequence text, int i2, int i3, int i4) {
                    Intrinsics.m32179h(text, "text");
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@NotNull CharSequence text, int i2, int i3, int i4) {
                    Intrinsics.m32179h(text, "text");
                    CollectionEditorHeaderModel.this.m15955v2().mo14500d(text.toString());
                }
            };
        }
    });

    /* renamed from: t */
    @NotNull
    public final Lazy f29671t = LazyKt.m31881b(new Function0<CompoundButton.OnCheckedChangeListener>() { // from class: com.swiftsoft.anixartd.ui.model.main.editor.CollectionEditorHeaderModel$privateOnCheckedChangeListener$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public CompoundButton.OnCheckedChangeListener invoke() {
            final CollectionEditorHeaderModel collectionEditorHeaderModel = CollectionEditorHeaderModel.this;
            return new CompoundButton.OnCheckedChangeListener() { // from class: com.swiftsoft.anixartd.ui.model.main.editor.a
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    CollectionEditorHeaderModel this$0 = CollectionEditorHeaderModel.this;
                    Intrinsics.m32179h(this$0, "this$0");
                    this$0.m15955v2().mo14499c(z);
                }
            };
        }
    });

    /* compiled from: CollectionEditorHeaderModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/editor/CollectionEditorHeaderModel$Companion;", "", "", "DESCRIPTION_CHANGED", "I", "IMAGE_CHANGED", "IS_PRIVATE_CHANGED", "RELEASE_COUNT_CHANGED", "TITLE_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: CollectionEditorHeaderModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/editor/CollectionEditorHeaderModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: a */
        void mo14497a(@NotNull String str);

        /* renamed from: c */
        void mo14499c(boolean z);

        /* renamed from: d */
        void mo14500d(@NotNull String str);

        /* renamed from: e */
        void mo14501e();

        /* renamed from: m0 */
        void mo14502m0();

        void onChooseImage();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        ((TextInputEditText) view2.findViewById(C2507R.id.title_edit_text)).setText(this.f29662k);
        ((TextInputEditText) view2.findViewById(C2507R.id.description_edit_text)).setText(this.f29663l);
        ((TextView) view2.findViewById(C2507R.id.rules)).setText(Html.fromHtml(context.getString(C2507R.string.rules_collection)));
        String str = this.f29664m;
        File file = this.f29665n;
        if (str == null && file == null) {
            RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(C2507R.id.upload_image_layout);
            Intrinsics.m32178g(relativeLayout, "view.upload_image_layout");
            ViewsKt.m16378k(relativeLayout);
            ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(C2507R.id.replace_image_layout);
            Intrinsics.m32178g(constraintLayout, "view.replace_image_layout");
            ViewsKt.m16372e(constraintLayout);
        } else {
            RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(C2507R.id.upload_image_layout);
            Intrinsics.m32178g(relativeLayout2, "view.upload_image_layout");
            ViewsKt.m16372e(relativeLayout2);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view2.findViewById(C2507R.id.replace_image_layout);
            Intrinsics.m32178g(constraintLayout2, "view.replace_image_layout");
            ViewsKt.m16378k(constraintLayout2);
            if (file != null) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.image);
                Intrinsics.m32178g(appCompatImageView, "view.image");
                ViewsKt.m16374g(appCompatImageView, file, C2507R.drawable.placeholder_collection);
            } else if (str != null) {
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(C2507R.id.image);
                Intrinsics.m32178g(appCompatImageView2, "view.image");
                ViewsKt.m16376i(appCompatImageView2, str, C2507R.drawable.placeholder_collection);
            }
        }
        ((MaterialSwitch) view2.findViewById(C2507R.id.sw_private_collection)).setChecked(this.f29666o);
        TextView textView = (TextView) view2.findViewById(C2507R.id.collection_release_count);
        String string = context.getString(C2507R.string.out_count);
        Intrinsics.m32178g(string, "context.getString(R.string.out_count)");
        String format = String.format(string, Arrays.copyOf(new Object[]{Long.valueOf(this.f29667p), 100}, 2));
        Intrinsics.m32178g(format, "format(format, *args)");
        textView.setText(format);
        ((TextInputEditText) view2.findViewById(C2507R.id.title_edit_text)).addTextChangedListener((TextWatcher) this.f29669r.getValue());
        ((TextInputEditText) view2.findViewById(C2507R.id.description_edit_text)).addTextChangedListener((TextWatcher) this.f29670s.getValue());
        ((MaterialSwitch) view2.findViewById(C2507R.id.sw_private_collection)).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this.f29671t.getValue());
        TextView textView2 = (TextView) view2.findViewById(C2507R.id.rules);
        Intrinsics.m32178g(textView2, "view.rules");
        ViewsKt.m16377j(textView2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.editor.CollectionEditorHeaderModel$bind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                CollectionEditorHeaderModel.this.m15955v2().mo14501e();
                return Unit.f63088a;
            }
        });
        View findViewById = view2.findViewById(C2507R.id.upload_image);
        Intrinsics.m32178g(findViewById, "view.upload_image");
        ViewsKt.m16377j(findViewById, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.editor.CollectionEditorHeaderModel$bind$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                CollectionEditorHeaderModel.this.m15955v2().onChooseImage();
                return Unit.f63088a;
            }
        });
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2507R.id.replace_image);
        Intrinsics.m32178g(linearLayout, "view.replace_image");
        ViewsKt.m16377j(linearLayout, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.editor.CollectionEditorHeaderModel$bind$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                CollectionEditorHeaderModel.this.m15955v2().onChooseImage();
                return Unit.f63088a;
            }
        });
        LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(C2507R.id.btn_add_release);
        Intrinsics.m32178g(linearLayout2, "view.btn_add_release");
        ViewsKt.m16377j(linearLayout2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.editor.CollectionEditorHeaderModel$bind$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                CollectionEditorHeaderModel.this.m15955v2().mo14502m0();
                return Unit.f63088a;
            }
        });
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof CollectionEditorHeaderModel) {
            CollectionEditorHeaderModel collectionEditorHeaderModel = (CollectionEditorHeaderModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29662k, collectionEditorHeaderModel.f29662k)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29663l, collectionEditorHeaderModel.f29663l)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f29664m, collectionEditorHeaderModel.f29664m) || !Intrinsics.m32174c(this.f29665n, collectionEditorHeaderModel.f29665n)) {
                m12276k.add(2);
            }
            if (this.f29666o != collectionEditorHeaderModel.f29666o) {
                m12276k.add(3);
            }
            if (this.f29667p != collectionEditorHeaderModel.f29667p) {
                m12276k.add(4);
            }
            if (!m12276k.isEmpty()) {
                mo4519b2(view2, m12276k);
                return;
            }
        }
        mo4496Z1(view2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4519b2(@NotNull View view, @NotNull List<Object> list) {
        Context m12267b = C2052a.m12267b(view, "view", list, "payloads");
        list.contains(0);
        list.contains(1);
        if (list.contains(2)) {
            String str = this.f29664m;
            File file = this.f29665n;
            if (str == null && file == null) {
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2507R.id.upload_image_layout);
                Intrinsics.m32178g(relativeLayout, "view.upload_image_layout");
                ViewsKt.m16378k(relativeLayout);
                ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(C2507R.id.replace_image_layout);
                Intrinsics.m32178g(constraintLayout, "view.replace_image_layout");
                ViewsKt.m16372e(constraintLayout);
            } else {
                RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(C2507R.id.upload_image_layout);
                Intrinsics.m32178g(relativeLayout2, "view.upload_image_layout");
                ViewsKt.m16372e(relativeLayout2);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(C2507R.id.replace_image_layout);
                Intrinsics.m32178g(constraintLayout2, "view.replace_image_layout");
                ViewsKt.m16378k(constraintLayout2);
                if (file != null) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.image);
                    Intrinsics.m32178g(appCompatImageView, "view.image");
                    ViewsKt.m16374g(appCompatImageView, file, C2507R.drawable.placeholder_collection);
                } else if (str != null) {
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(C2507R.id.image);
                    Intrinsics.m32178g(appCompatImageView2, "view.image");
                    ViewsKt.m16376i(appCompatImageView2, str, C2507R.drawable.placeholder_collection);
                }
            }
        }
        if (list.contains(4)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.collection_release_count);
            String string = m12267b.getString(C2507R.string.out_count);
            Intrinsics.m32178g(string, "context.getString(R.string.out_count)");
            C2052a.m12290y(new Object[]{Long.valueOf(this.f29667p), 100}, 2, string, "format(format, *args)", textView);
        }
    }

    @NotNull
    /* renamed from: v2 */
    public final Listener m15955v2() {
        Listener listener = this.f29668q;
        if (listener != null) {
            return listener;
        }
        Intrinsics.m32189r("listener");
        throw null;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: w2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        ((TextInputEditText) view.findViewById(C2507R.id.title_edit_text)).removeTextChangedListener((TextWatcher) this.f29669r.getValue());
        ((TextInputEditText) view.findViewById(C2507R.id.description_edit_text)).removeTextChangedListener((TextWatcher) this.f29670s.getValue());
        ((MaterialSwitch) view.findViewById(C2507R.id.sw_private_collection)).setOnCheckedChangeListener(null);
        view.findViewById(C2507R.id.upload_image).setOnClickListener(null);
        ((LinearLayout) view.findViewById(C2507R.id.replace_image)).setOnClickListener(null);
        ((LinearLayout) view.findViewById(C2507R.id.btn_add_release)).setOnClickListener(null);
    }
}
