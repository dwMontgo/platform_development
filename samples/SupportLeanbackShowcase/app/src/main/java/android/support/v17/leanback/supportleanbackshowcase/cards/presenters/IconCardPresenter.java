/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package android.support.v17.leanback.supportleanbackshowcase.cards.presenters;

import android.content.Context;
import android.support.v17.leanback.supportleanbackshowcase.R;
import android.support.v17.leanback.widget.ImageCardView;
import android.view.View;
import android.widget.ImageView;

/**
 * This Presenter will display cards which consists of a single icon which will be highlighted by a
 * surrounding circle when the card is focused. AndroidTV uses these cards for entering settings
 * menu.
 */
public class IconCardPresenter extends ImageCardViewPresenter {

    public IconCardPresenter(Context context) {
        super(context, R.style.IconCardStyle);
    }

    @Override
    protected ImageCardView onCreateView() {
        final ImageCardView imageCardView = super.onCreateView();
        final ImageView image = imageCardView.getMainImageView();
        imageCardView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    image.setBackgroundResource(R.drawable.icon_focused);
                } else {
                    image.setBackground(null);
                }
            }
        });
        return imageCardView;
    }

}
