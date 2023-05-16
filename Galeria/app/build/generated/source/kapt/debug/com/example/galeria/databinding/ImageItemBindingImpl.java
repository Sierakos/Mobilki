package com.example.galeria.databinding;
import com.example.galeria.R;
import com.example.galeria.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ImageItemBindingImpl extends ImageItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.delete_button, 6);
        sViewsWithIds.put(R.id.like_button, 7);
        sViewsWithIds.put(R.id.comment_input, 8);
        sViewsWithIds.put(R.id.add_comment_button, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ImageItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ImageItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.EditText) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[6]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.Button) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.captionView.setTag(null);
        this.commentsView.setTag(null);
        this.imageView.setTag(null);
        this.likesView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.titleView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.image == variableId) {
            setImage((com.example.galeria.Image) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setImage(@Nullable com.example.galeria.Image Image) {
        this.mImage = Image;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.image);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.galeria.Image image = mImage;
        int imageCommentsSize = 0;
        java.lang.String imageCaption = null;
        java.lang.String imageTitle = null;
        int imageLikes = 0;
        java.util.List<java.lang.String> imageComments = null;
        android.net.Uri imageUri = null;
        java.lang.String javaLangStringLajkiImageLikes = null;
        java.lang.String javaLangStringKomentarzeImageCommentsSize = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (image != null) {
                    // read image.caption
                    imageCaption = image.getCaption();
                    // read image.title
                    imageTitle = image.getTitle();
                    // read image.likes
                    imageLikes = image.getLikes();
                    // read image.comments
                    imageComments = image.getComments();
                    // read image.uri
                    imageUri = image.getUri();
                }


                // read ("Lajki: ") + (image.likes)
                javaLangStringLajkiImageLikes = ("Lajki: ") + (imageLikes);
                if (imageComments != null) {
                    // read image.comments.size()
                    imageCommentsSize = imageComments.size();
                }


                // read ("Komentarze: ") + (image.comments.size())
                javaLangStringKomentarzeImageCommentsSize = ("Komentarze: ") + (imageCommentsSize);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.captionView, imageCaption);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.commentsView, javaLangStringKomentarzeImageCommentsSize);
            com.example.galeria.BindingAdapters.setImageUrl(this.imageView, imageUri);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.likesView, javaLangStringLajkiImageLikes);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleView, imageTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): image
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}