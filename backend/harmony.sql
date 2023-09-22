/*
 Navicat Premium Data Transfer

 Source Server         : 阿里云
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : 47.117.166.111:3306
 Source Schema         : harmony

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 22/09/2023 18:43:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `store_id` bigint(20) NULL DEFAULT NULL,
  `total_price` double(16, 2) NULL DEFAULT NULL COMMENT '订单总价',
  `status` int(11) NULL DEFAULT NULL,
  `created_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE,
  INDEX `order_store`(`store_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 42 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES (36, 1, 1909.00, NULL, '2023-09-14 21:22:49', '2023-09-14 21:22:49');
INSERT INTO `order` VALUES (37, 1, 3818.00, NULL, '2023-09-14 21:22:58', '2023-09-14 21:22:58');
INSERT INTO `order` VALUES (38, 1, 1909.00, NULL, '2023-09-14 21:29:35', '2023-09-14 21:29:35');
INSERT INTO `order` VALUES (39, 1, 1909.00, NULL, '2023-09-14 21:37:07', '2023-09-14 21:37:07');
INSERT INTO `order` VALUES (40, 0, 1909.00, NULL, '2023-09-20 17:31:38', '2023-09-20 17:31:38');
INSERT INTO `order` VALUES (41, 0, 1909.00, NULL, '2023-09-20 17:32:31', '2023-09-20 17:32:31');

-- ----------------------------
-- Table structure for order_goods
-- ----------------------------
DROP TABLE IF EXISTS `order_goods`;
CREATE TABLE `order_goods`  (
  `goods_id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `goods_weight` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `goods_price` double(16, 2) NULL DEFAULT NULL,
  `goods_total_price` double(16, 2) NULL DEFAULT NULL,
  `order_id` int(11) NULL DEFAULT NULL,
  `store_id` bigint(20) NULL DEFAULT NULL,
  `status` int(11) NULL DEFAULT NULL,
  `created_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`goods_id`) USING BTREE,
  INDEX `goods_store`(`store_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 349 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order_goods
-- ----------------------------
INSERT INTO `order_goods` VALUES (295, '苹果', '500g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (296, '苹果', '400g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (297, '苹果', '200g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (298, '苹果', '290g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (299, '苹果', '200g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (300, '苹果', '200g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (301, '苹果', '200g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (302, '荔枝', '201g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (303, '橘子', '121g', 1.00, 221.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (304, '苹果', '500g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (305, '苹果', '400g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (306, '苹果', '200g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (307, '苹果', '290g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (308, '苹果', '200g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (309, '苹果', '200g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (310, '苹果', '200g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (311, '荔枝', '201g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (312, '橘子', '121g', 1.00, 221.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (313, '苹果', '500g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (314, '苹果', '400g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (315, '苹果', '200g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (316, '苹果', '290g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (317, '苹果', '200g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (318, '苹果', '200g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (319, '苹果', '200g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (320, '荔枝', '201g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (321, '橘子', '121g', 1.00, 221.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (322, '苹果', '500g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (323, '苹果', '400g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (324, '苹果', '200g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (325, '苹果', '290g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (326, '苹果', '200g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (327, '苹果', '200g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (328, '苹果', '200g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (329, '荔枝', '201g', 2.00, 211.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (330, '橘子', '121g', 1.00, 221.00, 1, 1, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (331, '苹果', '500g', 2.00, 211.00, 0, 0, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (332, '苹果', '400g', 2.00, 211.00, 0, 0, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (333, '苹果', '200g', 2.00, 211.00, 0, 0, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (334, '苹果', '290g', 2.00, 211.00, 0, 0, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (335, '苹果', '200g', 2.00, 211.00, 0, 0, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (336, '苹果', '200g', 2.00, 211.00, 0, 0, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (337, '苹果', '200g', 2.00, 211.00, 0, 0, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (338, '荔枝', '201g', 2.00, 211.00, 0, 0, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (339, '橘子', '121g', 1.00, 221.00, 0, 0, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (340, '苹果', '500g', 2.00, 211.00, 0, 0, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (341, '苹果', '400g', 2.00, 211.00, 0, 0, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (342, '苹果', '200g', 2.00, 211.00, 0, 0, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (343, '苹果', '290g', 2.00, 211.00, 0, 0, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (344, '苹果', '200g', 2.00, 211.00, 0, 0, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (345, '苹果', '200g', 2.00, 211.00, 0, 0, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (346, '苹果', '200g', 2.00, 211.00, 0, 0, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (347, '荔枝', '201g', 2.00, 211.00, 0, 0, NULL, NULL, NULL);
INSERT INTO `order_goods` VALUES (348, '橘子', '121g', 1.00, 221.00, 0, 0, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `product_price` double(16, 2) NULL DEFAULT NULL,
  `product_unit` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `store_id` int(20) NULL DEFAULT NULL,
  `status` int(11) NULL DEFAULT NULL,
  `created_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`product_id`) USING BTREE,
  INDEX `goods_store`(`store_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 222 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (212, ':-', 6.00, '20g', 1, NULL, '2023-09-10 16:01:00', '2023-09-10 16:01:00');
INSERT INTO `product` VALUES (213, '&&', 855.00, '50g', 1, 1, '2023-09-10 16:06:17', '2023-09-10 16:07:45');
INSERT INTO `product` VALUES (214, '$', 655.00, '50g', 1, 1, '2023-09-10 16:12:29', '2023-09-10 16:12:54');
INSERT INTO `product` VALUES (215, '++', 7.00, '50g', 1, NULL, '2023-09-10 16:17:03', '2023-09-10 16:17:03');
INSERT INTO `product` VALUES (216, '6', 7.00, '20g', 1, NULL, '2023-09-11 20:31:04', '2023-09-11 20:31:04');
INSERT INTO `product` VALUES (217, '--', 7.00, '20g', 1, NULL, '2023-09-11 20:31:11', '2023-09-11 20:31:11');
INSERT INTO `product` VALUES (218, '555', 6.00, '20g', 1, NULL, '2023-09-12 19:40:10', '2023-09-12 19:40:10');
INSERT INTO `product` VALUES (219, '---', 760.00, '50g', 1, NULL, '2023-09-12 19:42:46', '2023-09-12 19:43:12');
INSERT INTO `product` VALUES (220, '苹果', 2.00, '20g', 1, NULL, '2023-09-21 21:22:31', '2023-09-21 21:22:31');
INSERT INTO `product` VALUES (221, '苹果', 5.00, '20g', 1, NULL, '2023-09-21 21:31:42', '2023-09-21 21:31:42');

-- ----------------------------
-- Table structure for store
-- ----------------------------
DROP TABLE IF EXISTS `store`;
CREATE TABLE `store`  (
  `store_id` bigint(20) NOT NULL,
  `store_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `store_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '所在分区：如冷冻区、水产区',
  `status` int(11) NULL DEFAULT NULL COMMENT '关门，营业中',
  `created_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`store_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of store
-- ----------------------------
INSERT INTO `store` VALUES (1, NULL, '1', NULL, NULL, NULL, NULL);
INSERT INTO `store` VALUES (123456, '小贾海鲜', '123456', '水产', 1, NULL, NULL);

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo`  (
  `user_id` int(11) NOT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `level` int(11) NULL DEFAULT NULL,
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `created_time` datetime(0) NULL DEFAULT NULL,
  `updated_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
