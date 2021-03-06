/*
 * Copyright 2016 drakeet. https://github.com/drakeet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.drakeet.multitype.sample;

import me.drakeet.multitype.MultiTypePool;
import me.drakeet.multitype.sample.common.Category;
import me.drakeet.multitype.sample.common.CategoryItemViewProvider;
import me.drakeet.multitype.sample.bilibili.HorizontalItemViewProvider;
import me.drakeet.multitype.sample.bilibili.PostList;
import me.drakeet.multitype.sample.bilibili.PostRowItem;
import me.drakeet.multitype.sample.bilibili.PostRowItemViewProvider;
import me.drakeet.multitype.sample.communicate_with_provider.SimpleData;
import me.drakeet.multitype.sample.communicate_with_provider.SimpleDataViewProvider;
import me.drakeet.multitype.sample.grid.Square;
import me.drakeet.multitype.sample.grid.SquareViewProvider;
import me.drakeet.multitype.sample.normal.ImageItem;
import me.drakeet.multitype.sample.normal.ImageItemViewProvider;
import me.drakeet.multitype.sample.normal.RichItem;
import me.drakeet.multitype.sample.normal.RichItemViewProvider;
import me.drakeet.multitype.sample.normal.TextItem;
import me.drakeet.multitype.sample.normal.TextItemViewProvider;

/**
 * @author drakeet
 */
class MultiTypeInstaller {

    static void start() {
        MultiTypePool.register(TextItem.class, new TextItemViewProvider());
        MultiTypePool.register(ImageItem.class, new ImageItemViewProvider());
        MultiTypePool.register(RichItem.class, new RichItemViewProvider());
        MultiTypePool.register(Category.class, new CategoryItemViewProvider());
        MultiTypePool.register(PostRowItem.class, new PostRowItemViewProvider());
        MultiTypePool.register(PostList.class, new HorizontalItemViewProvider());
        MultiTypePool.register(Square.class, new SquareViewProvider());
        MultiTypePool.register(SimpleData.class, new SimpleDataViewProvider());
    }
}
