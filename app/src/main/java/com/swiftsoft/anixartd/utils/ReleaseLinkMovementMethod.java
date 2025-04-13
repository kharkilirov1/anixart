package com.swiftsoft.anixartd.utils;

import android.text.Layout;
import android.text.NoCopySpan;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

/* loaded from: classes2.dex */
public class ReleaseLinkMovementMethod extends ScrollingMovementMethod {

    /* renamed from: b */
    public static final Object f30238b = new NoCopySpan.Concrete();

    /* renamed from: a */
    public final ClickListener f30239a;

    public interface ClickListener {
        /* renamed from: a */
        boolean mo15631a(String str);
    }

    public ReleaseLinkMovementMethod(ClickListener clickListener) {
        this.f30239a = clickListener;
    }

    /* renamed from: a */
    public final boolean m16354a(int i2, TextView textView, Spannable spannable) {
        Layout layout = textView.getLayout();
        int totalPaddingBottom = textView.getTotalPaddingBottom() + textView.getTotalPaddingTop();
        int scrollY = textView.getScrollY();
        int height = (textView.getHeight() + scrollY) - totalPaddingBottom;
        int lineForVertical = layout.getLineForVertical(scrollY);
        int lineForVertical2 = layout.getLineForVertical(height);
        int lineStart = layout.getLineStart(lineForVertical);
        int lineEnd = layout.getLineEnd(lineForVertical2);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(lineStart, lineEnd, ClickableSpan.class);
        int selectionStart = Selection.getSelectionStart(spannable);
        int selectionEnd = Selection.getSelectionEnd(spannable);
        int min = Math.min(selectionStart, selectionEnd);
        int max = Math.max(selectionStart, selectionEnd);
        if (min < 0 && spannable.getSpanStart(f30238b) >= 0) {
            min = spannable.length();
            max = min;
        }
        if (min > lineEnd) {
            max = Integer.MAX_VALUE;
            min = Integer.MAX_VALUE;
        }
        int i3 = -1;
        if (max < lineStart) {
            max = -1;
            min = -1;
        }
        if (i2 == 1) {
            if (min == max) {
                return false;
            }
            ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable.getSpans(min, max, ClickableSpan.class);
            if (clickableSpanArr2.length != 1) {
                return false;
            }
            clickableSpanArr2[0].onClick(textView);
        } else if (i2 == 2) {
            int i4 = -1;
            for (ClickableSpan clickableSpan : clickableSpanArr) {
                int spanEnd = spannable.getSpanEnd(clickableSpan);
                if ((spanEnd < max || min == max) && spanEnd > i4) {
                    i3 = spannable.getSpanStart(clickableSpan);
                    i4 = spanEnd;
                }
            }
            if (i3 >= 0) {
                Selection.setSelection(spannable, i4, i3);
                return true;
            }
        } else if (i2 == 3) {
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (ClickableSpan clickableSpan2 : clickableSpanArr) {
                int spanStart = spannable.getSpanStart(clickableSpan2);
                if ((spanStart > min || min == max) && spanStart < i6) {
                    i5 = spannable.getSpanEnd(clickableSpan2);
                    i6 = spanStart;
                }
            }
            if (i5 < Integer.MAX_VALUE) {
                Selection.setSelection(spannable, i6, i5);
                return true;
            }
        }
        return false;
    }

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean canSelectArbitrarily() {
        return true;
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod
    public boolean down(TextView textView, Spannable spannable) {
        return m16354a(3, textView, spannable) || super.down(textView, spannable);
    }

    @Override // android.text.method.BaseMovementMethod
    public boolean handleMovementKey(TextView textView, Spannable spannable, int i2, int i3, KeyEvent keyEvent) {
        if ((i2 == 23 || i2 == 66) && KeyEvent.metaStateHasNoModifiers(i3) && keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0 && m16354a(1, textView, spannable)) {
            return true;
        }
        return super.handleMovementKey(textView, spannable, i2, i3, keyEvent);
    }

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public void initialize(TextView textView, Spannable spannable) {
        Selection.removeSelection(spannable);
        spannable.removeSpan(f30238b);
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod
    public boolean left(TextView textView, Spannable spannable) {
        return m16354a(2, textView, spannable) || super.left(textView, spannable);
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public void onTakeFocus(TextView textView, Spannable spannable, int i2) {
        Selection.removeSelection(spannable);
        if ((i2 & 1) != 0) {
            spannable.setSpan(f30238b, 0, 0, 34);
        } else {
            spannable.removeSpan(f30238b);
        }
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX() + totalPaddingLeft;
            int scrollY = textView.getScrollY() + totalPaddingTop;
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    String url = ((URLSpan) clickableSpanArr[0]).getURL();
                    ClickListener clickListener = this.f30239a;
                    if (clickListener == null || !clickListener.mo15631a(url)) {
                        clickableSpanArr[0].onClick(textView);
                    }
                } else {
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
                }
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod
    public boolean right(TextView textView, Spannable spannable) {
        return m16354a(3, textView, spannable) || super.right(textView, spannable);
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod
    public boolean up(TextView textView, Spannable spannable) {
        return m16354a(2, textView, spannable) || super.up(textView, spannable);
    }
}
