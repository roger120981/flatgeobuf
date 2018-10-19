#include "catch.hpp"

#include "../packedhilbertrtree.h"

using namespace FlatGeobuf;

TEST_CASE("PackedHilbertRTree")
{
    SECTION("PackedHilbertRTree single item")
    {
        PackedHilbertRTree tree(1);
        tree.add(0, 0, 1, 1);
        tree.finish();
        auto list = tree.search(0, 0, 1, 1);
        REQUIRE(list.size() == 1);
    }

    SECTION("PackedHilbertRTree two items")
    {
        PackedHilbertRTree tree(2);
        tree.add(0, 0, 1, 1);
        tree.add(2, 2, 3, 3);
        tree.finish();
        auto list = tree.search(1, 1, 2, 2);
        REQUIRE(list.size() == 2);
    }

    SECTION("PackedHilbertRTree roundtrip single item")
    {
        PackedHilbertRTree tree(1);
        tree.add(0, 0, 1, 1);
        tree.finish();
        auto data = PackedHilbertRTree::toData(tree);
        auto tree2 = PackedHilbertRTree::fromData(1, data);
        auto list = tree2.search(0, 0, 1, 1);
        REQUIRE(list.size() == 1);
    }

    SECTION("PackedHilbertRTree roundtrip single item")
    {
        PackedHilbertRTree tree(2);
        tree.add(0, 0, 1, 1);
        tree.add(2, 2, 3, 3);
        tree.finish();
        auto data = PackedHilbertRTree::toData(tree);
        auto tree2 = PackedHilbertRTree::fromData(2, data);
        auto list = tree.search(1, 1, 2, 2);
        REQUIRE(list.size() == 2);
    }
}