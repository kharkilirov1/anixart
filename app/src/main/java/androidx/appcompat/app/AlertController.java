package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.C0055R;
import androidx.core.widget.NestedScrollView;
import com.swiftsoft.anixartd.C2507R;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    public NestedScrollView f317A;

    /* renamed from: C */
    public Drawable f319C;

    /* renamed from: D */
    public ImageView f320D;

    /* renamed from: E */
    public TextView f321E;

    /* renamed from: F */
    public TextView f322F;

    /* renamed from: G */
    public View f323G;

    /* renamed from: H */
    public ListAdapter f324H;

    /* renamed from: J */
    public int f326J;

    /* renamed from: K */
    public int f327K;

    /* renamed from: L */
    public int f328L;

    /* renamed from: M */
    public int f329M;

    /* renamed from: N */
    public int f330N;

    /* renamed from: O */
    public int f331O;

    /* renamed from: P */
    public boolean f332P;

    /* renamed from: Q */
    public Handler f333Q;

    /* renamed from: a */
    public final Context f335a;

    /* renamed from: b */
    public final AppCompatDialog f336b;

    /* renamed from: c */
    public final Window f337c;

    /* renamed from: d */
    public final int f338d;

    /* renamed from: e */
    public CharSequence f339e;

    /* renamed from: f */
    public CharSequence f340f;

    /* renamed from: g */
    public ListView f341g;

    /* renamed from: h */
    public View f342h;

    /* renamed from: i */
    public int f343i;

    /* renamed from: j */
    public int f344j;

    /* renamed from: k */
    public int f345k;

    /* renamed from: l */
    public int f346l;

    /* renamed from: m */
    public int f347m;

    /* renamed from: o */
    public Button f349o;

    /* renamed from: p */
    public CharSequence f350p;

    /* renamed from: q */
    public Message f351q;

    /* renamed from: r */
    public Drawable f352r;

    /* renamed from: s */
    public Button f353s;

    /* renamed from: t */
    public CharSequence f354t;

    /* renamed from: u */
    public Message f355u;

    /* renamed from: v */
    public Drawable f356v;

    /* renamed from: w */
    public Button f357w;

    /* renamed from: x */
    public CharSequence f358x;

    /* renamed from: y */
    public Message f359y;

    /* renamed from: z */
    public Drawable f360z;

    /* renamed from: n */
    public boolean f348n = false;

    /* renamed from: B */
    public int f318B = 0;

    /* renamed from: I */
    public int f325I = -1;

    /* renamed from: R */
    public final View.OnClickListener f334R = new View.OnClickListener() { // from class: androidx.appcompat.app.AlertController.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message obtain = (view != alertController.f349o || (message3 = alertController.f351q) == null) ? (view != alertController.f353s || (message2 = alertController.f355u) == null) ? (view != alertController.f357w || (message = alertController.f359y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f333Q.obtainMessage(1, alertController2.f336b).sendToTarget();
        }
    };

    public static class AlertParams {

        /* renamed from: a */
        public final Context f372a;

        /* renamed from: b */
        public final LayoutInflater f373b;

        /* renamed from: c */
        public Drawable f374c;

        /* renamed from: d */
        public CharSequence f375d;

        /* renamed from: e */
        public View f376e;

        /* renamed from: f */
        public CharSequence f377f;

        /* renamed from: g */
        public CharSequence f378g;

        /* renamed from: h */
        public DialogInterface.OnClickListener f379h;

        /* renamed from: i */
        public CharSequence f380i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f381j;

        /* renamed from: k */
        public CharSequence f382k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f383l;

        /* renamed from: n */
        public DialogInterface.OnCancelListener f385n;

        /* renamed from: o */
        public DialogInterface.OnDismissListener f386o;

        /* renamed from: p */
        public DialogInterface.OnKeyListener f387p;

        /* renamed from: q */
        public CharSequence[] f388q;

        /* renamed from: r */
        public ListAdapter f389r;

        /* renamed from: s */
        public DialogInterface.OnClickListener f390s;

        /* renamed from: t */
        public View f391t;

        /* renamed from: u */
        public boolean[] f392u;

        /* renamed from: v */
        public boolean f393v;

        /* renamed from: w */
        public boolean f394w;

        /* renamed from: y */
        public DialogInterface.OnMultiChoiceClickListener f396y;

        /* renamed from: x */
        public int f395x = -1;

        /* renamed from: m */
        public boolean f384m = true;

        /* renamed from: androidx.appcompat.app.AlertController$AlertParams$2 */
        class C00632 extends CursorAdapter {

            /* renamed from: b */
            public final int f399b;

            /* renamed from: c */
            public final int f400c;

            /* renamed from: d */
            public final /* synthetic */ RecycleListView f401d;

            /* renamed from: e */
            public final /* synthetic */ AlertController f402e;

            /* renamed from: f */
            public final /* synthetic */ AlertParams f403f;

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f399b));
                this.f401d.setItemChecked(cursor.getPosition(), cursor.getInt(this.f400c) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return this.f403f.f373b.inflate(this.f402e.f329M, viewGroup, false);
            }
        }

        public interface OnPrepareListViewListener {
        }

        public AlertParams(Context context) {
            this.f372a = context;
            this.f373b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    public static final class ButtonHandler extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f409a;

        public ButtonHandler(DialogInterface dialogInterface) {
            this.f409a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f409a.get(), message.what);
            } else {
                if (i2 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class CheckedItemAdapter extends ArrayAdapter<CharSequence> {
        public CheckedItemAdapter(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public static class RecycleListView extends ListView {

        /* renamed from: b */
        public final int f410b;

        /* renamed from: c */
        public final int f411c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0055R.styleable.f310u);
            this.f411c = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f410b = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public AlertController(Context context, AppCompatDialog appCompatDialog, Window window) {
        this.f335a = context;
        this.f336b = appCompatDialog;
        this.f337c = window;
        this.f333Q = new ButtonHandler(appCompatDialog);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0055R.styleable.f295f, C2507R.attr.alertDialogStyle, 0);
        this.f326J = obtainStyledAttributes.getResourceId(0, 0);
        this.f327K = obtainStyledAttributes.getResourceId(2, 0);
        this.f328L = obtainStyledAttributes.getResourceId(4, 0);
        this.f329M = obtainStyledAttributes.getResourceId(5, 0);
        this.f330N = obtainStyledAttributes.getResourceId(7, 0);
        this.f331O = obtainStyledAttributes.getResourceId(3, 0);
        this.f332P = obtainStyledAttributes.getBoolean(6, true);
        this.f338d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        appCompatDialog.m456f(1);
    }

    /* renamed from: a */
    public static boolean m358a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m358a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m359c(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: b */
    public final void m360b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    @Nullable
    /* renamed from: d */
    public final ViewGroup m361d(@Nullable View view, @Nullable View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: e */
    public void m362e(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message obtainMessage = onClickListener != null ? this.f333Q.obtainMessage(i2, onClickListener) : null;
        if (i2 == -3) {
            this.f358x = charSequence;
            this.f359y = obtainMessage;
            this.f360z = null;
        } else if (i2 == -2) {
            this.f354t = charSequence;
            this.f355u = obtainMessage;
            this.f356v = null;
        } else {
            if (i2 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f350p = charSequence;
            this.f351q = obtainMessage;
            this.f352r = null;
        }
    }
}
